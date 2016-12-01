/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import atm.lib.*;
import javax.swing.JOptionPane;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Blackburn1318
 */
public class FormTransferenciaCliente extends javax.swing.JFrame {

    
    int limitador;
    private String nome;
    private String agencia;
    private String numConta;
    private String valor;
    
    private String thisNome="felipe";
    private String thisAgencia="1234";
    private String thisNumconta="12345678-9";
    /**
     * Creates new form FormTransferencia
     */
    public FormTransferenciaCliente() {
        initComponents();
    }
    
    public void setLimitador(int limitador)
    {
        this.limitador = limitador;
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
        jPanel1 = new javax.swing.JPanel();
        btnSeguinte = new javax.swing.JButton();
        btnRetornar = new javax.swing.JButton();
        cboTipoConta = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        txtNumConta = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSeguinte.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeguinte.setText("Seguinte");
        btnSeguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguinteActionPerformed(evt);
            }
        });

        btnRetornar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRetornar.setText("Retornar");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        cboTipoConta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cboTipoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "poupança", "corrente" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Agência");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Tipo de conta");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Número da conta");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Valor");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Nome");

        txtAgencia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        try{
            javax.swing.text.MaskFormatter campoAgencia= new javax.swing.text.MaskFormatter("####");

            txtAgencia = new javax.swing.JFormattedTextField(campoAgencia);
            txtAgencia.setFont(new java.awt.Font("Tahoma", 0, 24));
        }catch(Exception e){
        }

        txtNumConta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        try{
            javax.swing.text.MaskFormatter campoNumConta= new javax.swing.text.MaskFormatter("########-#");

            txtNumConta = new javax.swing.JFormattedTextField(campoNumConta);
            txtNumConta.setFont(new java.awt.Font("Tahoma", 0, 24));
        }catch(Exception e){
        }

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitulo.setText("jLabel2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("Sua conta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeguinte, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(cboTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(114, 114, 114)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(26, 26, 26)
                                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(26, 26, 26)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel8)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeguinte, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        switch(limitador)
        {
            case 1:
                lblTitulo.setText("<html> Transferência entre contas do mesmo banco </html>");
                break;
            case 2:
                 lblTitulo.setText("<html>Transferência<pre style=\"font-family:Tahoma;\">        DOC</pre></html>");
                break;
            case 3:
                lblTitulo.setText("<html>Transferência <br /><pre style=\"font-family:Tahoma;\">        TED</pre></html>");
                break;
        }
        
        txtAgencia.setText(agencia);
        txtNome.setText(nome);
        txtNumConta.setText(numConta);
        txtValor.setText(valor);
     
    }//GEN-LAST:event_formWindowActivated

    public void setAnterior()
    {
        FormTransferenciaDestinatario form = new FormTransferenciaDestinatario();
        form.setLimitador(limitador);
        form.setValores(nome, agencia, numConta, valor);
        form.setVisible(true);
        this.hide();
    }
    
    private void btnSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguinteActionPerformed
        valor = txtValor.getText();
        nome = txtNome.getText();
        numConta = txtNumConta.getText();
        agencia = txtAgencia.getText();
      if((valor.equals("")||nome.equals(""))||(numConta.equals("        - ")||agencia.equals("    ")))
      {
          String erro = "Campos \n";
         if(agencia.equals("    "))
             erro+="Número da agência \n";
         if(numConta.equals("        - "))
            erro+="Número da conta \n";
         if(nome.equals(""))
             erro+="Nome \n";
         if(valor.equals(""))
              erro+="Valor \n";
         
         erro+=" Vazios";
         
         JOptionPane.showMessageDialog(null, erro);
      }
      else
      {
        if((numConta.equals(thisNumconta)&&agencia.equals(thisAgencia))&&nome.equals(thisNome))
        {
            if(limitador == 1)
            {
                setAnterior();
            }
            else if(limitador == 2)
            {
                if(Integer.parseInt(valor) >= 1 && Integer.parseInt(valor) <= 1000)
                {
                    setAnterior();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Os valores aceitos para DOC e de 1 ate 1000");
                }
            }
            else if(limitador == 3)
            {
                if(Integer.parseInt(valor) >= 1000)
                {
                    setAnterior();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "O valor minimo para transferencia TED e de 1000");
                }
            }
        }
      }
    }//GEN-LAST:event_btnSeguinteActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        FormOperacao form = new FormOperacao();
        form.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRetornarActionPerformed

    public void setValores(String nome, String numConta, String valor, String agencia)
    {
       this.agencia = agencia;
       this.nome = nome;
       this.numConta = numConta;
       this.valor = valor;
    }
    
    
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
            java.util.logging.Logger.getLogger(FormTransferenciaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransferenciaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransferenciaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransferenciaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransferenciaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetornar;
    private javax.swing.JButton btnSeguinte;
    private javax.swing.JComboBox<String> cboTipoConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumConta;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
