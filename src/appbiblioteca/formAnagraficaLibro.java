/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appbiblioteca;

/**
 *
 * @author studente
 */

import javax.swing.ImageIcon;
import java.sql.SQLException;

public class formAnagraficaLibro extends javax.swing.JFrame {

    /**
     * Creates new form formLibro
     */
    
    private formPannelloErrore pe;
    
    public formAnagraficaLibro() {
        initComponents();
        this.pe = new formPannelloErrore();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBaseLibro = new javax.swing.JPanel();
        jPISBN = new javax.swing.JPanel();
        jLISBN = new javax.swing.JLabel();
        jTISBN = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLDatiLibro = new javax.swing.JLabel();
        jLTitoloLibro = new javax.swing.JLabel();
        jLAutoriLibro = new javax.swing.JLabel();
        jTextAutoriLibro = new javax.swing.JTextField();
        jTextTitoloLibro = new javax.swing.JTextField();
        jImgLibro = new javax.swing.JLabel();
        jLGenere = new javax.swing.JLabel();
        jLAnnoPubblicazione = new javax.swing.JLabel();
        jLEditore = new javax.swing.JLabel();
        jTextGenere = new javax.swing.JTextField();
        jTextAnno = new javax.swing.JTextField();
        jTextEditore = new javax.swing.JTextField();
        jButtonSubmitLibro = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libro");
        setResizable(false);
        setSize(new java.awt.Dimension(521, 367));

        jBaseLibro.setBackground(new java.awt.Color(51, 0, 0));

        jPISBN.setBackground(new java.awt.Color(255, 204, 102));
        jPISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 5));

        jLISBN.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLISBN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLISBN.setText("Codice ISBN");

        jTISBN.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTISBN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPISBNLayout = new javax.swing.GroupLayout(jPISBN);
        jPISBN.setLayout(jPISBNLayout);
        jPISBNLayout.setHorizontalGroup(
            jPISBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPISBNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPISBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTISBN)
                    .addComponent(jLISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPISBNLayout.setVerticalGroup(
            jPISBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPISBNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLISBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 5));

        jLDatiLibro.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLDatiLibro.setText("Dati libro");

        jLTitoloLibro.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLTitoloLibro.setText("Titolo:");

        jLAutoriLibro.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLAutoriLibro.setText("Autore/i:");

        jImgLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImgLibro.setIcon(new ImageIcon("book.png"));

        jLGenere.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLGenere.setText("Genere:");

        jLAnnoPubblicazione.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLAnnoPubblicazione.setText("Anno di pubblicazione:");

        jLEditore.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLEditore.setText("Editore:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTitoloLibro)
                            .addComponent(jLAutoriLibro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTitoloLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAutoriLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLDatiLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLGenere)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextGenere, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLAnnoPubblicazione)
                        .addGap(18, 18, 18)
                        .addComponent(jTextAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLEditore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextEditore, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jImgLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jImgLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLDatiLibro)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTitoloLibro)
                            .addComponent(jTextTitoloLibro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAutoriLibro)
                            .addComponent(jTextAutoriLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLGenere)
                            .addComponent(jTextGenere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAnnoPubblicazione)
                            .addComponent(jTextAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEditore)
                            .addComponent(jTextEditore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );

        jButtonSubmitLibro.setBackground(new java.awt.Color(255, 204, 102));
        jButtonSubmitLibro.setIcon(new ImageIcon("check2.png"));
        jButtonSubmitLibro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSubmitLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitLibroActionPerformed(evt);
            }
        });

        jButtonAnnulla.setBackground(new java.awt.Color(255, 204, 102));
        jButtonAnnulla.setIcon(new ImageIcon("cancel.png"));
        jButtonAnnulla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jBaseLibroLayout = new javax.swing.GroupLayout(jBaseLibro);
        jBaseLibro.setLayout(jBaseLibroLayout);
        jBaseLibroLayout.setHorizontalGroup(
            jBaseLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBaseLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jBaseLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jBaseLibroLayout.createSequentialGroup()
                        .addComponent(jButtonSubmitLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAnnulla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jBaseLibroLayout.setVerticalGroup(
            jBaseLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBaseLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBaseLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSubmitLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnnulla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBaseLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBaseLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonSubmitLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitLibroActionPerformed
        
        try {
            // Creazione oggetto libro
            Libro l = new Libro(this.jTextTitoloLibro.getText(),
                    this.jTextAutoriLibro.getText(),
                    this.jTextEditore.getText(),
                    Integer.parseInt(this.jTextAnno.getText()),
                    this.jTextGenere.getText(),
                    this.jTISBN.getText()
            );
            InterazioneDB iDB = new InterazioneDB();
            iDB.comandoQL(l.getQueryInsert());
            iDB.chiudiConnessione();
        } catch (UserException | IsbnNonValido | SQLException ex) {
            this.pe.setMessaggio(ex.getMessage());
            this.pe.setVisible(true);
        }
    }//GEN-LAST:event_jButtonSubmitLibroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBaseLibro;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonSubmitLibro;
    private javax.swing.JLabel jImgLibro;
    private javax.swing.JLabel jLAnnoPubblicazione;
    private javax.swing.JLabel jLAutoriLibro;
    private javax.swing.JLabel jLDatiLibro;
    private javax.swing.JLabel jLEditore;
    private javax.swing.JLabel jLGenere;
    private javax.swing.JLabel jLISBN;
    private javax.swing.JLabel jLTitoloLibro;
    private javax.swing.JPanel jPISBN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTISBN;
    private javax.swing.JTextField jTextAnno;
    private javax.swing.JTextField jTextAutoriLibro;
    private javax.swing.JTextField jTextEditore;
    private javax.swing.JTextField jTextGenere;
    private javax.swing.JTextField jTextTitoloLibro;
    // End of variables declaration//GEN-END:variables
}
