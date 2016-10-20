/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import com.bd.Instancia;
import com.dominio.AreaInteresse;
import javax.swing.JOptionPane;

/**
 *
 * @author Jéssica
 */
public class AlterarAreasInteresse extends javax.swing.JFrame {

    /**
     * Creates new form AlterarAreasInteresse
     */
    public AlterarAreasInteresse() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        AICalculo = new javax.swing.JCheckBox();
        AIAlgebra = new javax.swing.JCheckBox();
        AIFisica = new javax.swing.JCheckBox();
        AIFilosofia = new javax.swing.JCheckBox();
        AIHistoria = new javax.swing.JCheckBox();
        AILogica = new javax.swing.JCheckBox();
        AIMatematica = new javax.swing.JCheckBox();
        AIOutro = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltar.setBackground(new java.awt.Color(112, 128, 144));
        btnVoltar.setForeground(new java.awt.Color(112, 128, 144));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Voltar.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(112, 128, 144));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/logopequeno.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("ÁREAS DE INTERESSE");

        btnSair.setBackground(new java.awt.Color(112, 128, 144));
        btnSair.setForeground(new java.awt.Color(112, 128, 144));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/BotaoSair.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(112, 128, 144));
        btnHome.setForeground(new java.awt.Color(112, 128, 144));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHome)
                            .addComponent(btnSair)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(261, 140));

        jLabel16.setText("Editar áreas:");

        AICalculo.setBackground(new java.awt.Color(204, 204, 255));
        AICalculo.setText("Cálculo");
        AICalculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AICalculoMouseClicked(evt);
            }
        });
        AICalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AICalculoActionPerformed(evt);
            }
        });

        AIAlgebra.setBackground(new java.awt.Color(204, 204, 255));
        AIAlgebra.setText("Álgebra");

        AIFisica.setBackground(new java.awt.Color(204, 204, 255));
        AIFisica.setText("Física");

        AIFilosofia.setBackground(new java.awt.Color(204, 204, 255));
        AIFilosofia.setText("Filosofia");

        AIHistoria.setBackground(new java.awt.Color(204, 204, 255));
        AIHistoria.setText("História");

        AILogica.setBackground(new java.awt.Color(204, 204, 255));
        AILogica.setText("Lógica");

        AIMatematica.setBackground(new java.awt.Color(204, 204, 255));
        AIMatematica.setText("Matemática");

        AIOutro.setBackground(new java.awt.Color(204, 204, 255));
        AIOutro.setText("Outros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AICalculo)
                            .addComponent(AIAlgebra)
                            .addComponent(AIFisica)
                            .addComponent(AIFilosofia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AIHistoria)
                            .addComponent(AILogica)
                            .addComponent(AIMatematica)
                            .addComponent(AIOutro))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AICalculo)
                    .addComponent(AIHistoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AIAlgebra)
                    .addComponent(AILogica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AIFisica)
                    .addComponent(AIMatematica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AIFilosofia)
                    .addComponent(AIOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Configuração tela = new Configuração();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       int resposta;
        resposta = JOptionPane.showConfirmDialog(null,"Deseja sair?");
        if(resposta == JOptionPane.YES_OPTION){
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        Home tela = new Home();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void AICalculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AICalculoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AICalculoMouseClicked

    private void AICalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AICalculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AICalculoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Instancia instancia = Instancia.getInstancia();
        AreaInteresse areaInteresse = new AreaInteresse();
        int retorno;
        
        areaInteresse.setCalculo(AICalculo.isSelected());
        areaInteresse.setAlgebra(AIAlgebra.isSelected());
        areaInteresse.setFisica(AIFisica.isSelected());
        areaInteresse.setFilosofia(AIFilosofia.isSelected());
        areaInteresse.setHistoria(AIHistoria.isSelected());
        areaInteresse.setLogica(AILogica.isSelected());
        areaInteresse.setMatematica(AIMatematica.isSelected());
        areaInteresse.setOutro(AIOutro.isSelected());

        retorno = areaInteresse.atualizarAreaInteresse();
        if(retorno == 0){
            JOptionPane.showMessageDialog(null, "Áreas de atuação atualizadas com sucesso","Atualização realizada",JOptionPane.PLAIN_MESSAGE);
            Configuração tela = new Configuração();
            tela.setVisible(true);
            dispose();   
        }else{
            JOptionPane.showMessageDialog(null, "Atualização não realizada", "Erro", JOptionPane.ERROR_MESSAGE);
            DadosPessoais tela = new DadosPessoais();
            tela.setVisible(true);
            dispose();
            
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarAreasInteresse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarAreasInteresse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarAreasInteresse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarAreasInteresse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarAreasInteresse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AIAlgebra;
    private javax.swing.JCheckBox AICalculo;
    private javax.swing.JCheckBox AIFilosofia;
    private javax.swing.JCheckBox AIFisica;
    private javax.swing.JCheckBox AIHistoria;
    private javax.swing.JCheckBox AILogica;
    private javax.swing.JCheckBox AIMatematica;
    private javax.swing.JCheckBox AIOutro;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
