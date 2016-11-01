/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import com.bd.Instancia;
import com.dominio.AreaAtuacao;
import com.dominio.AreaInteresse;
import com.dominio.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javafx.util.Pair;
import javax.swing.JOptionPane;

/**
 *
 * @author m174505
 */
public class Pesquisa extends javax.swing.JFrame {
    
    
    private AreaAtuacao areaAtuacao;
    private AreaInteresse areaInteresse;
    /**
     * Creates new form Pesquisar
     */
    public Pesquisa() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        AACalculo = new javax.swing.JCheckBox();
        AAAlgebra = new javax.swing.JCheckBox();
        AAFisica = new javax.swing.JCheckBox();
        AAFilosofia = new javax.swing.JCheckBox();
        AAHistoria = new javax.swing.JCheckBox();
        AALogica = new javax.swing.JCheckBox();
        AAMatematica = new javax.swing.JCheckBox();
        AAOutro = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        AICalculo = new javax.swing.JCheckBox();
        AIAlgebra = new javax.swing.JCheckBox();
        AIFisica = new javax.swing.JCheckBox();
        AIFilosofia = new javax.swing.JCheckBox();
        AIHistoria = new javax.swing.JCheckBox();
        AILogica = new javax.swing.JCheckBox();
        AIMatematica = new javax.swing.JCheckBox();
        AIOutro = new javax.swing.JCheckBox();
        rdoTodos = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(112, 128, 144));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/logopequeno.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("PESQUISA");

        btnHome.setBackground(new java.awt.Color(153, 153, 153));
        btnHome.setForeground(new java.awt.Color(112, 128, 144));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(153, 153, 153));
        btnSair.setForeground(new java.awt.Color(112, 128, 144));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/BotaoSair.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(120, 120, 120)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHome)
                            .addComponent(btnSair)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        btnPesquisar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(218, 218, 218));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(261, 135));

        jLabel16.setFont(new java.awt.Font("Simplified Arabic", 3, 16)); // NOI18N
        jLabel16.setText("Pesquisar Áreas de atuação:");

        AACalculo.setBackground(new java.awt.Color(216, 216, 216));
        AACalculo.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AACalculo.setText("Cálculo");
        AACalculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AACalculoMouseClicked(evt);
            }
        });
        AACalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AACalculoActionPerformed(evt);
            }
        });

        AAAlgebra.setBackground(new java.awt.Color(216, 216, 216));
        AAAlgebra.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AAAlgebra.setText("Álgebra");

        AAFisica.setBackground(new java.awt.Color(216, 216, 216));
        AAFisica.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AAFisica.setText("Física");

        AAFilosofia.setBackground(new java.awt.Color(216, 216, 216));
        AAFilosofia.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AAFilosofia.setText("Filosofia");

        AAHistoria.setBackground(new java.awt.Color(216, 216, 216));
        AAHistoria.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AAHistoria.setText("História");

        AALogica.setBackground(new java.awt.Color(216, 216, 216));
        AALogica.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AALogica.setText("Lógica");

        AAMatematica.setBackground(new java.awt.Color(216, 216, 216));
        AAMatematica.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AAMatematica.setText("Matemática");

        AAOutro.setBackground(new java.awt.Color(216, 216, 216));
        AAOutro.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AAOutro.setText("Outros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AACalculo)
                            .addComponent(AAAlgebra)
                            .addComponent(AAFisica)
                            .addComponent(AAFilosofia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AAHistoria)
                            .addComponent(AALogica)
                            .addComponent(AAMatematica)
                            .addComponent(AAOutro))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AACalculo)
                    .addComponent(AAHistoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AAAlgebra)
                    .addComponent(AALogica, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AAFisica)
                    .addComponent(AAMatematica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AAFilosofia)
                    .addComponent(AAOutro))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        btnVoltar.setBackground(new java.awt.Color(153, 153, 153));
        btnVoltar.setForeground(new java.awt.Color(112, 128, 144));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Voltar.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setText("Filtros");

        jPanel2.setBackground(new java.awt.Color(216, 216, 216));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(261, 135));

        jLabel14.setFont(new java.awt.Font("Simplified Arabic", 3, 16)); // NOI18N
        jLabel14.setText("Pesquisar Áreas de interesse:");

        AICalculo.setBackground(new java.awt.Color(216, 216, 216));
        AICalculo.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AICalculo.setText("Cálculo");

        AIAlgebra.setBackground(new java.awt.Color(216, 216, 216));
        AIAlgebra.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AIAlgebra.setText("Álgebra");

        AIFisica.setBackground(new java.awt.Color(216, 216, 216));
        AIFisica.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AIFisica.setText("Física");

        AIFilosofia.setBackground(new java.awt.Color(216, 216, 216));
        AIFilosofia.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AIFilosofia.setText("Filosofia");

        AIHistoria.setBackground(new java.awt.Color(216, 216, 216));
        AIHistoria.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AIHistoria.setText("História");

        AILogica.setBackground(new java.awt.Color(216, 216, 216));
        AILogica.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AILogica.setText("Lógica");

        AIMatematica.setBackground(new java.awt.Color(216, 216, 216));
        AIMatematica.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AIMatematica.setText("Matemática");

        AIOutro.setBackground(new java.awt.Color(216, 216, 216));
        AIOutro.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        AIOutro.setText("Outros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AICalculo)
                            .addComponent(AIAlgebra)
                            .addComponent(AIFisica)
                            .addComponent(AIFilosofia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AIHistoria)
                                    .addComponent(AILogica)
                                    .addComponent(AIOutro))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(AIMatematica)
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AICalculo)
                    .addComponent(AIHistoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AIAlgebra)
                    .addComponent(AILogica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AIFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AIMatematica, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AIFilosofia)
                    .addComponent(AIOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        rdoTodos.setBackground(new java.awt.Color(255, 255, 255));
        rdoTodos.setFont(new java.awt.Font("Simplified Arabic", 0, 16)); // NOI18N
        rdoTodos.setText("Pesquisar todos os usuários");
        rdoTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTodosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Simplified Arabic", 1, 16)); // NOI18N
        jLabel2.setText("Pesquisa por nome: ");

        txtNome.setBackground(new java.awt.Color(247, 243, 243));
        txtNome.setFont(new java.awt.Font("Simplified Arabic", 0, 16)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(321, 321, 321)
                        .addComponent(btnPesquisar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoTodos))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel4)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoTodos))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltar)
                    .addComponent(btnPesquisar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Instancia instancia = Instancia.getInstancia();
        List<Usuario> listaUsuario = new ArrayList<>();
        areaAtuacao = new AreaAtuacao();
        areaInteresse = new AreaInteresse();
        Usuario usuario = new Usuario();
        String nome;
        Boolean todos;
        
        
        usuario.setNome(txtNome.getText());
        todos = rdoTodos.isSelected();

        areaAtuacao.setCalculo(AACalculo.isSelected());
        areaAtuacao.setAlgebra(AAAlgebra.isSelected());
        areaAtuacao.setFisica(AAFisica.isSelected());
        areaAtuacao.setFilosofia(AAFilosofia.isSelected());
        areaAtuacao.setHistoria(AAHistoria.isSelected());
        areaAtuacao.setLogica(AALogica.isSelected());
        areaAtuacao.setMatematica(AAMatematica.isSelected());
        areaAtuacao.setOutro(AAOutro.isSelected());

        areaInteresse.setCalculo(AICalculo.isSelected());
        areaInteresse.setAlgebra(AIAlgebra.isSelected());
        areaInteresse.setFisica(AIFisica.isSelected());
        areaInteresse.setFilosofia(AIFilosofia.isSelected());
        areaInteresse.setHistoria(AIHistoria.isSelected());
        areaInteresse.setLogica(AILogica.isSelected());
        areaInteresse.setMatematica(AIMatematica.isSelected());
        areaInteresse.setOutro(AIOutro.isSelected());
        
       
        if( (rdoTodos.isSelected()==false) && (txtNome.getText().equals("")) && 
            (areaInteresse.isCalculo()==false)&&(areaInteresse.isAlgebra()==false)&&(areaInteresse.isFisica()==false)&&(areaInteresse.isFilosofia()==false)&&(areaInteresse.isHistoria()==false)&&(areaInteresse.isLogica()==false)&&(areaInteresse.isMatematica()==false)&&(areaInteresse.isOutro()==false)  
            &&
            (areaAtuacao.isCalculo()==false)&&(areaAtuacao.isAlgebra()==false)&&(areaAtuacao.isFisica()==false)&&(areaAtuacao.isFilosofia()==false)&&(areaAtuacao.isHistoria()==false)&&(areaAtuacao.isLogica()==false)&&(areaAtuacao.isMatematica()==false)&&(areaAtuacao.isOutro()==false)
            ){
            JOptionPane.showMessageDialog(null, "Nenhum campo selecionado."  ,"Erro na pesquisa",JOptionPane.ERROR_MESSAGE);
        }else{
            
            if(!usuario.getNome().equals("")){
                listaUsuario = usuario.pesquisarUsuarioPorNome();
            } else if (todos == true){
                listaUsuario = usuario.pesquisarTodosUsuarios();
            } else if(isAreaAtuacao() && !isAreaInteresse()) {
                listaUsuario = areaAtuacao.pesquisarAreaAtuacao();
            } else if(isAreaInteresse() && !isAreaAtuacao()) {
                listaUsuario = areaInteresse.pesquisarAreaInteresse();
            } else if(isAreaAtuacao() && isAreaInteresse()){
                listaUsuario = areaAtuacao.pesquisarAreasAtuacaoInteresse(areaInteresse);
            }


            ResultadoPesquisa tela = new ResultadoPesquisa(listaUsuario);
            tela.setVisible(true);
            dispose();
        }
        
        
        
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    private boolean isAreaAtuacao() {
        for(Pair<String, Boolean> area : areaAtuacao.areasSelecionadas()) {
            if(area.getValue() == true)
                return true;
        }            
        return false;
    }
    

    private boolean isAreaInteresse() {
        for(Pair<String, Boolean> area : areaInteresse.areasSelecionadas()) {
            if(area.getValue() == true)
                return true;
        } 
        return false;
    }
    

    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        Home tela = new Home();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Home tela = new Home();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void AACalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AACalculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AACalculoActionPerformed

    private void AACalculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AACalculoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AACalculoMouseClicked

    private void rdoTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTodosActionPerformed
        // TODO add your handling code here:
        if(rdoTodos.isSelected() == true){
            txtNome.setEnabled(false);
            
            AACalculo.setEnabled(false);
            AAAlgebra.setEnabled(false);
            AAFisica.setEnabled(false);
            AAFilosofia.setEnabled(false);
            AAHistoria.setEnabled(false);
            AALogica.setEnabled(false);
            AAMatematica.setEnabled(false);
            AAOutro.setEnabled(false);
            
            AICalculo.setEnabled(false);
            AIAlgebra.setEnabled(false);
            AIFisica.setEnabled(false);
            AIFilosofia.setEnabled(false);
            AIHistoria.setEnabled(false);
            AILogica.setEnabled(false);
            AIMatematica.setEnabled(false);
            AIOutro.setEnabled(false);
            
        }else{
            txtNome.setEnabled(true);
            
            AACalculo.setEnabled(true);
            AAAlgebra.setEnabled(true);
            AAFisica.setEnabled(true);
            AAFilosofia.setEnabled(true);
            AAHistoria.setEnabled(true);
            AALogica.setEnabled(true);
            AAMatematica.setEnabled(true);
            AAOutro.setEnabled(true);
            
            AICalculo.setEnabled(true);
            AIAlgebra.setEnabled(true);
            AIFisica.setEnabled(true);
            AIFilosofia.setEnabled(true);
            AIHistoria.setEnabled(true);
            AILogica.setEnabled(true);
            AIMatematica.setEnabled(true);
            AIOutro.setEnabled(true);
            
        }

    }//GEN-LAST:event_rdoTodosActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        if(txtNome.getText() != null){
            rdoTodos.setEnabled(false);
            
            AACalculo.setEnabled(false);
            AAAlgebra.setEnabled(false);
            AAFisica.setEnabled(false);
            AAFilosofia.setEnabled(false);
            AAHistoria.setEnabled(false);
            AALogica.setEnabled(false);
            AAMatematica.setEnabled(false);
            AAOutro.setEnabled(false);
            
            AICalculo.setEnabled(false);
            AIAlgebra.setEnabled(false);
            AIFisica.setEnabled(false);
            AIFilosofia.setEnabled(false);
            AIHistoria.setEnabled(false);
            AILogica.setEnabled(false);
            AIMatematica.setEnabled(false);
            AIOutro.setEnabled(false);
            
        }else{
            rdoTodos.setEnabled(true);
            
            AACalculo.setEnabled(true);
            AAAlgebra.setEnabled(true);
            AAFisica.setEnabled(true);
            AAFilosofia.setEnabled(true);
            AAHistoria.setEnabled(true);
            AALogica.setEnabled(true);
            AAMatematica.setEnabled(true);
            AAOutro.setEnabled(true);
            
            AICalculo.setEnabled(true);
            AIAlgebra.setEnabled(true);
            AIFisica.setEnabled(true);
            AIFilosofia.setEnabled(true);
            AIHistoria.setEnabled(true);
            AILogica.setEnabled(true);
            AIMatematica.setEnabled(true);
            AIOutro.setEnabled(true);
            
        }
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AAAlgebra;
    private javax.swing.JCheckBox AACalculo;
    private javax.swing.JCheckBox AAFilosofia;
    private javax.swing.JCheckBox AAFisica;
    private javax.swing.JCheckBox AAHistoria;
    private javax.swing.JCheckBox AALogica;
    private javax.swing.JCheckBox AAMatematica;
    private javax.swing.JCheckBox AAOutro;
    private javax.swing.JCheckBox AIAlgebra;
    private javax.swing.JCheckBox AICalculo;
    private javax.swing.JCheckBox AIFilosofia;
    private javax.swing.JCheckBox AIFisica;
    private javax.swing.JCheckBox AIHistoria;
    private javax.swing.JCheckBox AILogica;
    private javax.swing.JCheckBox AIMatematica;
    private javax.swing.JCheckBox AIOutro;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton rdoTodos;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
