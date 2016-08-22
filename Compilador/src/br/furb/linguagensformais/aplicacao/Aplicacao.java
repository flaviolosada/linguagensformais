/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.linguagensformais.aplicacao;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.ScrollBar;
import javax.swing.JOptionPane;

/**
 *
 * @author Flávio e Carol
 */
public class Aplicacao extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacao
     */
    public Aplicacao() {
        initComponents();
        JTA_Editor_Palavras.setLineWrap(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTA_Editor_Palavras = new javax.swing.JTextArea();
        JB_Analisar = new javax.swing.JButton();
        JB_Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTA_Editor_Palavras.setColumns(20);
        JTA_Editor_Palavras.setRows(5);
        jScrollPane1.setViewportView(JTA_Editor_Palavras);

        JB_Analisar.setText("Analisar");
        JB_Analisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AnalisarActionPerformed(evt);
            }
        });

        JB_Limpar.setText("Limpar");
        JB_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JB_Analisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_Limpar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Analisar)
                    .addComponent(JB_Limpar))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_AnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AnalisarActionPerformed
        this.analisar();
    }//GEN-LAST:event_JB_AnalisarActionPerformed

    private void JB_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LimparActionPerformed
        this.JTA_Editor_Palavras.setText("");
    }//GEN-LAST:event_JB_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Analisar;
    private javax.swing.JButton JB_Limpar;
    private javax.swing.JTextArea JTA_Editor_Palavras;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void analisar() {
//        Palavra palavra = new Palavra();
        List<Palavra> lstPalavra = this.getPalavras(this.JTA_Editor_Palavras.getText().toString());
        
//        JOptionPane.showMessageDialog(null, teste);
    }
    
    public List<Palavra> getPalavras(String text){
        Palavra palavra = null;
        List<Palavra> lstPalavra = new ArrayList<>();
        
        String[] linha = text.split("\\n");
        for (int numeroLinha = 0; numeroLinha < linha.length; numeroLinha++) {
            String p = linha[numeroLinha].replace(" ", "\n").replace("\t", "\n");
            String[] palavras = p.split("\\n");
            for (int teste = 0; teste < palavras.length; teste++) {
                if (!palavras[teste].equals("")){
                    palavra = new Palavra();
                    palavra.setSequencia(palavras[teste]);
                    palavra.setLinha(numeroLinha + 1);
                    lstPalavra.add(palavra);
                }
            }
        }
        
        return lstPalavra;
    }
    
//    public List<Palavra> getPalavras(String text){
//        Palavra palavra = null;
//        
//        text = text.replace("\n", "\n\n\n\n");
//        text = text.replace("\t", "");
//        text = text.replace(" ", "\n");
//        
//        String[] linha = text.split("\\n\\n\\n\\n");
//        List<Palavra> lstPalavra = new ArrayList<>();
//        for (int numeroLinha = 0; numeroLinha < linha.length; numeroLinha++) {
//            String palavras[] = linha[numeroLinha].split("\\n");
//            for (int p = 0; p < palavras.length; p++) {
//                palavra = new Palavra();
//                palavra.setSequencia(palavras[p]);
//                palavra.setLinha(numeroLinha + 1);
//                lstPalavra.add(palavra);
//            }
//        }
//        
//        return lstPalavra;
//    }
    
    //APENAS TESTE
//    public List<Palavra> getPalavras(String text){
//        Palavra palavra = null;
//        boolean teste = text.contains(" ");
//        System.out.println(teste);
//        String[] linha = text.split("\\n");
//        List<Palavra> lstPalavra = new ArrayList<>();
//        for (int numeroLinha = 0; numeroLinha < linha.length; numeroLinha++) {
//            String palavras[] = linha[numeroLinha].split("\\t");
//            for (int p = 0; p < palavras.length; p++) {
//                palavra = new Palavra();
//                palavra.setDescricao(palavras[p]);
//                palavra.setLinha(numeroLinha + 1);
//                lstPalavra.add(palavra);
//            }
//        }
//        return null;
//    }
}
