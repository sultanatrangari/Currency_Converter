package cConvert;

public class cConverters extends javax.swing.JFrame {
    
    double US_Dollar = 0.015;
    double Britian_GBP = 0.012;
    double Singapore_SGD = 0.021;
    double Brazilian_Real = 0.050;
    double Canadian_Dollar = 0.020;
    double Indonesian_Rupiah = 209.61;
    double Kenyan_Shilling = 1.60;
    
    public cConverters() {
        initComponents();
    }
                       
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcmbCurrency = new javax.swing.JComboBox<>();
        jlblConvert = new javax.swing.JLabel();
        jtxtConvert = new javax.swing.JTextField();
        jbtnConvert = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel1.setText("Currency Converter");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jcmbCurrency.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jcmbCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "USA", "Great Britian", "Singapore", "Brazil", "Canada", "Indonesia", "Kenya" }));

        jlblConvert.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jlblConvert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jtxtConvert.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jtxtConvert.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jbtnConvert.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jbtnConvert.setText("Convert");
        jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnConvert)
                        .addGap(47, 47, 47)
                        .addComponent(jbtnReset)
                        .addGap(56, 56, 56)
                        .addComponent(jbtnExit)))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnConvert)
                    .addComponent(jbtnReset)
                    .addComponent(jbtnExit))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jtxtConvert.setText(null);
        jlblConvert.setText(null);
        jcmbCurrency.setSelectedIndex(0);
    }                                         

    private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {                                            
      
      double Indian_Rupee = Double.parseDouble(jtxtConvert.getText());
      
      if (jcmbCurrency.getSelectedItem().equals("USA"))
     {
       String cConvert1 = String.format("USD %.2f",Indian_Rupee * US_Dollar);
       jlblConvert.setText(cConvert1);
     }
      if (jcmbCurrency.getSelectedItem().equals("Great Britian"))
     {
       String cConvert1 = String.format("GBP %.2f",Indian_Rupee * Britian_GBP);
       jlblConvert.setText(cConvert1);
     }
      if (jcmbCurrency.getSelectedItem().equals("Singapore"))
     {
       String cConvert1 = String.format("SGD %.2f",Indian_Rupee * Singapore_SGD);
       jlblConvert.setText(cConvert1);
     }
      if (jcmbCurrency.getSelectedItem().equals("Brazil"))
     {
       String cConvert1 = String.format("R$ %.2f",Indian_Rupee * Brazilian_Real);
       jlblConvert.setText(cConvert1);
     }
      if (jcmbCurrency.getSelectedItem().equals("Canada"))
     {
       String cConvert1 = String.format("Can$ %.2f",Indian_Rupee * Canadian_Dollar);
       jlblConvert.setText(cConvert1);
     }
      if (jcmbCurrency.getSelectedItem().equals("Indonesia"))
     {
       String cConvert1 = String.format("Idr %.2f",Indian_Rupee * Indonesian_Rupiah);
       jlblConvert.setText(cConvert1);
     }
      if (jcmbCurrency.getSelectedItem().equals("Kenya"))
     {
       String cConvert1 = String.format("KS %.2f",Indian_Rupee * Kenyan_Shilling);
       jlblConvert.setText(cConvert1);
     }
        
        
    }                                           

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cConverters().setVisible(true);
            }
        });
    }
               
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnConvert;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> jcmbCurrency;
    private javax.swing.JLabel jlblConvert;
    private javax.swing.JTextField jtxtConvert;
}