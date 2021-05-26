/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabri
 */
public class ExibirSigno extends javax.swing.JFrame {

    /**
     * Creates new form ExibirSigno
     */
    public ExibirSigno() {
        initComponents();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - getWidth())/2, (tela.height - getHeight())/2);
    }
    
    public void exportarDados(Modelo.ModeloJanelaPrincipal model) throws IOException{
        jLabel2.setText(model.getNome() + " " + model.getSobrenome() + " seu Signo é :");
        
        int signo = 0;
        int getDia = 0;
        int getMes = 0;
        
        getDia = Integer.parseInt(model.getDia());
        getMes = Integer.parseInt(model.getMes());
        
        if(getMes == 3 ){
            if(getDia >= 21){
                    signo = 1;
            } else{
                signo = 12;
            }
        }
        if(getMes == 4 ){
            if(getDia >= 21){
                    signo = 2;
            } else{
                signo = 1;
            }   
        }
        if(getMes == 5 ){
            if(getDia >= 21){
                    signo = 3;
            } else{
                signo = 2;
            }
        }
        if(getMes == 6 ){
            if(getDia >= 21){
                    signo = 4;
            } else{
                signo = 3;
            }
        }
        if(getMes == 7 ){
            if(getDia >= 23){
                    signo = 5;
            } else{
                signo = 4;
            }   
        }
        if(getMes == 8 ){
            if(getDia >= 23){
                    signo = 6;
            } else{
                signo = 5;
            }
        }
        if(getMes == 9 ){
            if(getDia >= 23){
                    signo = 7;
            } else{
                signo = 6;
            }
        }
        if(getMes == 10 ){
            if(getDia >= 23){
                    signo = 8;
            } else{
                signo = 7;
            }
        }
        if(getMes == 11 ){
            if(getDia >= 22){
                    signo = 9;
            } else{
                signo = 8;
            }
        }
        if(getMes == 12 ){
            if(getDia >= 22){
                    signo = 9;
            } else{
                signo = 8;
            }
        }
        if(getMes == 1 ){
            if(getDia >= 21){
                    signo = 10;
            } else{
                signo = 9;
            }
        }
        if(getMes == 2 ){
            if(getDia >= 19){
                    signo = 11;
            } else{
                signo = 10;
            }
        }
            
        switch (signo){
            case 1:
                jLabel1.setText("Áries");
               jTextArea1.setText("Impulsivo, o ariano não pensa muito sobre seus atos. É aquele que "
                       + "primeiro age, depois reflete. Agitado, precisa de muita atividade para gastar a"
                       + " energia, senão pode ficar agressivo e explosivo.");
                break;
            case 2:
                jLabel1.setText("Touro");
                jTextArea1.setText("Teimoso, o taurino é determinado e protetor. Precisa de segurança e "
                        + "estabilidade para ser feliz, e conquista isso com muito trabalho e concentração."
                        + " Carinhoso, o taurino pode ser ciumento com quem ama");
                break;
            case 3:
                jLabel1.setText("Gêmeos");
                jTextArea1.setText("Espontâneo e um pouco instável, o geminiano é uma verdadeira caixinha "
                        + "de surpresas. Como é volátil, muitas vezes nem mesmo o geminiano se entende, "
                        + "mas o importante é que ele está sempre de bom humor e em busca de aventuras.");
                break;
            case 4:
                jLabel1.setText("Cancer");
                jTextArea1.setText("Família é a palavra-chave para o canceriano. Tranquilo e emotivo, "
                        + "gosta de ficar em casa, fazer programas com quem ama e curtir momentos com os "
                        + "parentes. Curioso, faz amizade com facilidade, mas pode ser um pouco sensível.");
                break;
            case 5:
                jLabel1.setText("Leão");
                jTextArea1.setText("Este é signo que veio para brilhar. O leonino gosta de chamar a "
                        + "atenção e ser o centro do mundo, mas também é muito amável e leal. Simpático e "
                        + "comunicativo, o nativo de leão pode ser um pouco ciumento e inseguro.");
                break;
            case 6:
                jLabel1.setText("Virgem");
                jTextArea1.setText("Perspicaz e inteligente, o virginiano está acostumado com o sucesso, por"
                        + " isso se cobra muito, assim como aos demais. Por isso, pode ser um pouco rígido "
                        + "e magoar quem ama. Tímido, prefere programas tranquilos a grandes eventos.");
                break;
            case 7:
                jLabel1.setText("Libra");
                jTextArea1.setText("O libriano gosta do que é belo e harmonioso. Não gosta de conflitos e por"
                        + " isso tenta ser imparcial em debates e brigas. Indeciso, pode demorar muito para "
                        + "escolher coisas simples, como o que comer ou vestir. Bom gosto define este signo.");
                break;
            case 8:
                jLabel1.setText("Escorpião");
                jTextArea1.setText("Determinado, o escorpiano vai até o fim para conquistar os seus "
                        + "objetivos. Sensual e romântico, gosta de estar em relacionamentos, mas pode ser "
                        + "desconfiado enquanto não se sentir seguro com a pessoa.");
                break;
            case 9:
                jLabel1.setText("Sagitário");
                jTextArea1.setText("Um signo de bem com a vida, que está sempre em busca de ação e que vive"
                        + " rodeado de amigos. Este é o signo de sagitário, que é sonhador e adora conhecer"
                        + " pessoas e lugares novos.");
                break;
            case 10:
                jLabel1.setText("Capricórnio");
                jTextArea1.setText("Trabalhador, tímido e educado, o capricórnio pode passar uma imagem de "
                        + "fechado e até mesmo antipático, mas é que ele precisa confiar em quem está ao "
                        + "seu lado para se abrir totalmente. Com paciência, ele se mostra um amigo leal e "
                        + "um companheiro fiel.");
                break;
            case 11:
                jLabel1.setText("Aquário");
                jTextArea1.setText("Independente, o aquariano preza muito por sua liberdade. Gosta de viajar"
                        + " sair e conhecer pessoas novas. Tem uma mente aberta e gosta de tudo o que é "
                        + "inovador e moderno, desde roupas e tecnologia, até mesmo atitudes comportamentais.");
                break;
            case 12:
                jLabel1.setText("Peixes");
                jTextArea1.setText("Este é o signo mais romântico do zodíaco. Sonhador e carinhoso, ele está"
                        + " sempre preocupado com o bem estar dos outros. Sensível e carinhoso, acredita em"
                        + " contos de fadas e acha que todos merecem um final feliz.");
                break;
        } 
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
                
        File arquivo = new File("log.txt");
          
          if( !arquivo.exists()){
              arquivo.createNewFile();
          }
          ArrayList lista = new ArrayList();
          lista.add("Log de Usuario ");
          lista.add("Usuario: "+ model.getNome() +" "+ model.getSobrenome()+", sexo: "+model.getSexo()+", dia de nascimento: "
                  + model.getDia()+", mes de Nascimento "+ model.getMes()+".\nInformacoes editadas: " 
                  + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))+"\n");
        try {
            Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
            FileReader reader = new FileReader(arquivo);
                  BufferedReader input = new BufferedReader(reader);
                  String linha;
                  while ((linha = input.readLine()) != null) {
                    System.out.println(linha);
                  }
        } catch (IOException ex) {
            Logger.getLogger(ExibirSigno.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Signo");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TextoInformacao");

        jButton1.setBackground(new java.awt.Color(59, 89, 152));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<< Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(59, 89, 152));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ver arquivo de Log");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JanelaPrincipal pJanela = new JanelaPrincipal();
        pJanela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        VerLog vLog = new VerLog();
        vLog.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(ExibirSigno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirSigno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirSigno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirSigno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirSigno().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
