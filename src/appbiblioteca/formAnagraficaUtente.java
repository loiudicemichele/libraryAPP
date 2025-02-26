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

public class formAnagraficaUtente extends javax.swing.JFrame {

    /**
     * Creates new form formAnagraficaUtente
     */
    
    private formPannelloErrore pe;
    
    public formAnagraficaUtente() {
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

        jBase = new javax.swing.JPanel();
        jNominativo = new javax.swing.JPanel();
        jLNominativo = new javax.swing.JLabel();
        JLNome = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLCognome = new javax.swing.JLabel();
        jTCognome = new javax.swing.JTextField();
        jLCodiceFiscale = new javax.swing.JLabel();
        jTCodiceFiscale = new javax.swing.JTextField();
        jImgNominativo = new javax.swing.JLabel();
        jDate = new javax.swing.JPanel();
        jLDateLuoghi = new javax.swing.JLabel();
        jLDataNascita = new javax.swing.JLabel();
        jLLuogoNascita = new javax.swing.JLabel();
        jTLuogoNascita = new javax.swing.JTextField();
        jLLuogoResidenza = new javax.swing.JLabel();
        jTLuogoResidenza = new javax.swing.JTextField();
        jTDataNascita = new javax.swing.JTextField();
        jImgDateLuoghi = new javax.swing.JLabel();
        jClasse = new javax.swing.JPanel();
        jLClasse = new javax.swing.JLabel();
        jLaClasse = new javax.swing.JLabel();
        jLSezione = new javax.swing.JLabel();
        jComboClasse = new javax.swing.JComboBox<>();
        jComboSezione = new javax.swing.JComboBox<>();
        jImgScuola = new javax.swing.JLabel();
        jImgClasse = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboIndirizzo = new javax.swing.JComboBox<>();
        jBSubmit = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anagrafica utente");
        setResizable(false);
        setSize(new java.awt.Dimension(521, 367));

        jBase.setBackground(new java.awt.Color(51, 0, 0));

        jNominativo.setBackground(new java.awt.Color(255, 204, 102));
        jNominativo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 5));

        jLNominativo.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLNominativo.setText("Nominativo");

        JLNome.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        JLNome.setText("Nome:");

        jLCognome.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLCognome.setText("Cognome:");

        jLCodiceFiscale.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLCodiceFiscale.setText("Codice fiscale:");

        jImgNominativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImgNominativo.setIcon(new ImageIcon("man.png"));

        javax.swing.GroupLayout jNominativoLayout = new javax.swing.GroupLayout(jNominativo);
        jNominativo.setLayout(jNominativoLayout);
        jNominativoLayout.setHorizontalGroup(
            jNominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNominativoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jNominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNominativo)
                    .addGroup(jNominativoLayout.createSequentialGroup()
                        .addComponent(JLNome)
                        .addGap(18, 18, 18)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLCognome)
                        .addGap(18, 18, 18)
                        .addComponent(jTCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jNominativoLayout.createSequentialGroup()
                        .addComponent(jLCodiceFiscale)
                        .addGap(18, 18, 18)
                        .addComponent(jTCodiceFiscale)))
                .addGap(18, 18, 18)
                .addComponent(jImgNominativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jNominativoLayout.setVerticalGroup(
            jNominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNominativoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jNominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jImgNominativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jNominativoLayout.createSequentialGroup()
                        .addComponent(jLNominativo)
                        .addGap(18, 18, 18)
                        .addGroup(jNominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLNome)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCognome)
                            .addComponent(jTCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jNominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCodiceFiscale)
                            .addComponent(jTCodiceFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jDate.setBackground(new java.awt.Color(255, 204, 102));
        jDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 5));

        jLDateLuoghi.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLDateLuoghi.setText("Date e luoghi");

        jLDataNascita.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLDataNascita.setText("Data di nascita [GG/MM/AA]:");

        jLLuogoNascita.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLLuogoNascita.setText("Luogo di nascita:");

        jTLuogoNascita.setToolTipText("");

        jLLuogoResidenza.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLLuogoResidenza.setText("Luogo di residenza:");

        jTLuogoResidenza.setToolTipText("");

        jImgDateLuoghi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImgDateLuoghi.setIcon(new ImageIcon("timetable.png"));

        javax.swing.GroupLayout jDateLayout = new javax.swing.GroupLayout(jDate);
        jDate.setLayout(jDateLayout);
        jDateLayout.setHorizontalGroup(
            jDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDateLayout.createSequentialGroup()
                        .addComponent(jLDataNascita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jDateLayout.createSequentialGroup()
                            .addComponent(jLLuogoNascita)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTLuogoNascita, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDateLayout.createSequentialGroup()
                            .addComponent(jLLuogoResidenza)
                            .addGap(18, 18, 18)
                            .addComponent(jTLuogoResidenza, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLDateLuoghi, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jImgDateLuoghi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDateLayout.setVerticalGroup(
            jDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jImgDateLuoghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDateLayout.createSequentialGroup()
                        .addComponent(jLDateLuoghi)
                        .addGap(18, 18, 18)
                        .addGroup(jDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDataNascita)
                            .addComponent(jTDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLLuogoNascita)
                            .addComponent(jTLuogoNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLLuogoResidenza)
                            .addComponent(jTLuogoResidenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jClasse.setBackground(new java.awt.Color(255, 204, 102));
        jClasse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 5));

        jLClasse.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLClasse.setText("Classe e sezione");

        jLaClasse.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLaClasse.setText("Classe:");

        jLSezione.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLSezione.setText("Sezione:");

        jComboClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClasseActionPerformed(evt);
            }
        });

        jComboSezione.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        jImgClasse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImgClasse.setIcon(new ImageIcon("blackboard.png"));

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel1.setText("Indirizzo:");

        jComboIndirizzo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatica", "Meccanica", "Elettronica", "Chimica", "Scienze A." }));

        javax.swing.GroupLayout jClasseLayout = new javax.swing.GroupLayout(jClasse);
        jClasse.setLayout(jClasseLayout);
        jClasseLayout.setHorizontalGroup(
            jClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jClasseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLClasse)
                    .addGroup(jClasseLayout.createSequentialGroup()
                        .addComponent(jLaClasse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLSezione)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboSezione, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jClasseLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jClasseLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jImgScuola)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jClasseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jImgClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jClasseLayout.setVerticalGroup(
            jClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jClasseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jClasseLayout.createSequentialGroup()
                        .addComponent(jLClasse)
                        .addGap(18, 18, 18)
                        .addGroup(jClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLaClasse)
                            .addComponent(jComboClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSezione)
                            .addComponent(jComboSezione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jClasseLayout.createSequentialGroup()
                        .addComponent(jImgScuola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jImgClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jBSubmit.setBackground(new java.awt.Color(255, 204, 102));
        jBSubmit.setIcon(new ImageIcon("check2.png"));
        jBSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubmitActionPerformed(evt);
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

        javax.swing.GroupLayout jBaseLayout = new javax.swing.GroupLayout(jBase);
        jBase.setLayout(jBaseLayout);
        jBaseLayout.setHorizontalGroup(
            jBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 522, Short.MAX_VALUE)
                    .addComponent(jClasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNominativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jBaseLayout.createSequentialGroup()
                        .addComponent(jBSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAnnulla, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jBaseLayout.setVerticalGroup(
            jBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNominativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButtonAnnulla, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboClasseActionPerformed

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jBSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubmitActionPerformed
        try {
            Utente u = new Utente(this.jTNome.getText(),
                    this.jTCognome.getText(),
                    this.jTCodiceFiscale.getText(),
                    this.jTLuogoNascita.getText(),
                    this.jTLuogoResidenza.getText(),
                    "" + this.jComboClasse.getSelectedItem() + 
                            this.jComboSezione.getSelectedItem() +
                            this.jComboIndirizzo.getSelectedItem()
            );
            InterazioneDB iDB = new InterazioneDB();
            iDB.comandoQL(u.getQueryInsert());
            iDB.chiudiConnessione();
        } catch(SQLException ex) {
            this.pe.setMessaggio(ex.getMessage());
            this.pe.setVisible(true);
        }
        
    }//GEN-LAST:event_jBSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLNome;
    private javax.swing.JButton jBSubmit;
    private javax.swing.JPanel jBase;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JPanel jClasse;
    private javax.swing.JComboBox<String> jComboClasse;
    private javax.swing.JComboBox<String> jComboIndirizzo;
    private javax.swing.JComboBox<String> jComboSezione;
    private javax.swing.JPanel jDate;
    private javax.swing.JLabel jImgClasse;
    private javax.swing.JLabel jImgDateLuoghi;
    private javax.swing.JLabel jImgNominativo;
    private javax.swing.JLabel jImgScuola;
    private javax.swing.JLabel jLClasse;
    private javax.swing.JLabel jLCodiceFiscale;
    private javax.swing.JLabel jLCognome;
    private javax.swing.JLabel jLDataNascita;
    private javax.swing.JLabel jLDateLuoghi;
    private javax.swing.JLabel jLLuogoNascita;
    private javax.swing.JLabel jLLuogoResidenza;
    private javax.swing.JLabel jLNominativo;
    private javax.swing.JLabel jLSezione;
    private javax.swing.JLabel jLaClasse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jNominativo;
    private javax.swing.JTextField jTCodiceFiscale;
    private javax.swing.JTextField jTCognome;
    private javax.swing.JTextField jTDataNascita;
    private javax.swing.JTextField jTLuogoNascita;
    private javax.swing.JTextField jTLuogoResidenza;
    private javax.swing.JTextField jTNome;
    // End of variables declaration//GEN-END:variables
}
