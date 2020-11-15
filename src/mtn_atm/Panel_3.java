/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mtn_atm;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import static mtn_atm.Panel_2.enter_button;


public class Panel_3 extends javax.swing.JPanel {

   
    static JFrame frame_3;
    int choi_de_lang=0;
    static String BankName;
    static int  account_number;
    static int  current_balance;
    
    
    public Panel_3(String Bank_Name, int  accountnumber, int balance) {
    initComponents();
    frame_3 = new JFrame("MTN_ATM");
    frame_3.add(this);
    BankName = Bank_Name;
    account_number =   accountnumber ;
    current_balance = new Class_Get_Balance().Get_Balance(Bank_Name, accountnumber);
    Bank_name_label.setText(BankName);
    balance_textfield.setText(current_balance+"");
    account_number_textfield.setText(account_number+"");
 
    String s = enter_button.getText();
               
        if(s.equalsIgnoreCase("Entrer"))
        {  cancel2_Button.setText("Annuler");   choi_de_l_achat.setText("Faites vos achats ici !!"); credit_Button.setText("Credit MTN"); electric_Button.setText("Eléctricité "); 
//        Frame3_1.jPanel_credit.setBorder(BorderFactory.createTitledBorder(null,"Transferez vos credit MTN d'ici", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-15"), Color.BLUE));
        choi_de_lang=1;
        }
        
        if(s.equalsIgnoreCase("Enter"))
        {  cancel2_Button.setText("Cancel");    choi_de_l_achat.setText("Choose what you need to buy !!"); 
        credit_Button.setText(" MTN credit"); 
        electric_Button.setText("Electricity "); 
//        Panel_3_1.jPanel_credit.setBorder(BorderFactory.createTitledBorder(null,"Transfer your MTN credit from here", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-15"), Color.BLUE));  choi_de_lang=2;
        }
        
       if(s.equalsIgnoreCase("ادخال"))
       {  cancel2_Button.setText("الغاء");     choi_de_l_achat.setText("ماذا  ترغب ان تشتري !!"); 
       credit_Button.setText("رصيد اريبا");    electric_Button.setText("كهرباء");  
      // Panel_3_1.jPanel_credit.setBorder(BorderFactory.createTitledBorder(null,"حول رصيدك من هنا ", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-15"), Color.BLUE)); 
       choi_de_lang=3;}   
       
    frame_3.setVisible(true);
    frame_3.pack();
    frame_3.setSize(585, 455);
    frame_3.setLocationRelativeTo(null);
    //frame_3.setResizable(false);
    frame_3.setDefaultCloseOperation(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        choi_de_l_achat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        electric_Button = new javax.swing.JButton();
        credit_Button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cancel2_Button = new javax.swing.JButton();
        Panel_3_5 = new javax.swing.JPanel();
        Bank_name_label = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        account_number_textfield = new javax.swing.JTextField();
        balance_textfield = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 0, 102));
        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue, 5));

        choi_de_l_achat.setFont(new java.awt.Font("Times New Roman", 1, 28));
        choi_de_l_achat.setForeground(new java.awt.Color(255, 255, 255));
        choi_de_l_achat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choi_de_l_achat.setText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));

        electric_Button.setBackground(new java.awt.Color(153, 0, 102));
        electric_Button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        electric_Button.setForeground(new java.awt.Color(255, 255, 255));
        electric_Button.setText("");
        electric_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                electric_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                electric_ButtonMouseExited(evt);
            }
        });
        electric_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electric_ButtonActionPerformed(evt);
            }
        });

        credit_Button.setBackground(new java.awt.Color(153, 0, 102));
        credit_Button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        credit_Button.setForeground(new java.awt.Color(255, 255, 255));
        credit_Button.setText("");
        credit_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                credit_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                credit_ButtonMouseExited(evt);
            }
        });
        credit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credit_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(credit_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(electric_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(electric_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));

        cancel2_Button.setBackground(new java.awt.Color(153, 0, 102));
        cancel2_Button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cancel2_Button.setForeground(new java.awt.Color(255, 255, 255));
        cancel2_Button.setText("");
        cancel2_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel2_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel2_ButtonMouseExited(evt);
            }
        });
        cancel2_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel2_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(cancel2_Button);

        Panel_3_5.setBackground(new java.awt.Color(255, 255, 51));
        Panel_3_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        Bank_name_label.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Bank_name_label.setForeground(new java.awt.Color(255, 0, 0));
        Bank_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bank_name_label.setText("Faisal Bank");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(java.awt.Color.blue);
        jLabel34.setText("No du compte");
        jLabel34.setToolTipText("");

        account_number_textfield.setEditable(false);
        account_number_textfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        account_number_textfield.setForeground(new java.awt.Color(204, 0, 0));
        account_number_textfield.setText("7995");

        balance_textfield.setEditable(false);
        balance_textfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balance_textfield.setForeground(new java.awt.Color(204, 0, 0));
        balance_textfield.setText("900 SDG");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(java.awt.Color.blue);
        jLabel33.setText("Votre credit");
        jLabel33.setToolTipText("");

        javax.swing.GroupLayout Panel_3_5Layout = new javax.swing.GroupLayout(Panel_3_5);
        Panel_3_5.setLayout(Panel_3_5Layout);
        Panel_3_5Layout.setHorizontalGroup(
            Panel_3_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_3_5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bank_name_label)
                .addGap(148, 148, 148))
            .addGroup(Panel_3_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(account_number_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(balance_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_3_5Layout.setVerticalGroup(
            Panel_3_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_3_5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bank_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_3_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(account_number_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(balance_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(choi_de_l_achat, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Panel_3_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(choi_de_l_achat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void electric_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electric_ButtonMouseEntered
        electric_Button.setBackground(Color.GREEN);
    }//GEN-LAST:event_electric_ButtonMouseEntered

    private void electric_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electric_ButtonMouseExited
        electric_Button.setBackground(Color.decode("#990066"));
    }//GEN-LAST:event_electric_ButtonMouseExited

    private void electric_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electric_ButtonActionPerformed
        frame_3.setVisible(false);
        Panel_3_2.account_number=Panel_3.account_number;
        Panel_3_2.Bank_Name=Panel_3.BankName;
        
        new Panel_3_2( BankName,account_number,current_balance);

        if(cancel2_Button.getText().equalsIgnoreCase("Annuler"))
        {Panel_3_2.counter_number.setText("No du compteur :-");  Panel_3_2.kilo_de_electricite.setText("Montant du Courant :-");
            Panel_3_2.Generate_Button.setText("Generer "); Panel_3_2.choi_d_achat2_Button.setText("Retour"); Panel_3_2.finish_3_2_Button.setText("Terminer");
            Panel_3_2.Panel_3_2.setBorder(BorderFactory.createTitledBorder(null,"Achetez votre electricite d'ici ", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-18"), Color.BLUE));}

        if(cancel2_Button.getText().equalsIgnoreCase("Cancel"))
        {Panel_3_2.counter_number.setText("Counter no :-");  Panel_3_2.kilo_de_electricite.setText("Electricity amount :-");  Panel_3_2.Generate_Button.setText("Generate ");Panel_3_2.choi_d_achat2_Button.setText("Back"); Panel_3_2.finish_3_2_Button.setText("Finish"); Panel_3_2.Panel_3_2.setBorder(BorderFactory.createTitledBorder(null,"Buy your electricy from here ", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-18"), Color.BLUE));}

        if(cancel2_Button.getText().equals("الغاء"))
        {Panel_3_2.counter_number.setText("رقم العداد ");  Panel_3_2.kilo_de_electricite.setText("كمية الكهرباء "); 
        Panel_3_2.Generate_Button.setText("توليد");  Panel_3_2.choi_d_achat2_Button.setText("رجوع"); 
        Panel_3_2.finish_3_2_Button.setText("انهاء");
        Panel_3_2.Panel_3_2.setBorder(BorderFactory.createTitledBorder(null,"قم بشراء الكهرباء من هنا", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-18"), Color.BLUE));
        
        }
        
        Panel_3_2.bank_name1.setText(BankName);
    }//GEN-LAST:event_electric_ButtonActionPerformed

    private void credit_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_credit_ButtonMouseEntered
        credit_Button.setBackground(Color.GREEN);
    }//GEN-LAST:event_credit_ButtonMouseEntered

    private void credit_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_credit_ButtonMouseExited
        credit_Button.setBackground(Color.decode("#990066"));
    }//GEN-LAST:event_credit_ButtonMouseExited

    private void credit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credit_ButtonActionPerformed
        frame_3.setVisible(false);
        Panel_3_1.account_number=account_number;
        Panel_3_1.Bank_Name=Panel_3.BankName;
        
        
        new Panel_3_1( BankName,account_number,current_balance);
        

        if(cancel2_Button.getText().equalsIgnoreCase("Annuler"))
        {Panel_3_1.no_phone_button.setText("No de téléphone :-");

            Panel_3_1.montant_button.setText("Montant du credit :-"); Panel_3_1.Generate_Button.setText("Transferer ");
            Panel_3_1.jPanel_credit.setBorder(BorderFactory.createTitledBorder(null,"Transferez vos credit MTN d'ici", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-22"), Color.BLUE));
            Panel_3_1.choi_d_achat1_Button.setText("Retour"); Panel_3_1.finish_3_1_Button.setText("Terminer");
        }

        if(cancel2_Button.getText().equalsIgnoreCase("Cancel"))
        {Panel_3_1.no_phone_button.setText("Phone number :-");  Panel_3_1.montant_button.setText("Credit amount :-");
            Panel_3_1.jPanel_credit.setBorder(BorderFactory.createTitledBorder(null,"Transfer your MTN credit from here", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-22"), Color.BLUE));
            Panel_3_1.Generate_Button.setText("Transfer ");Panel_3_1.choi_d_achat1_Button.setText("Back");
            Panel_3_1.finish_3_1_Button.setText("Finish"); ;
        }

        if(cancel2_Button.getText().equals("الغاء"))
        {Panel_3_1.no_phone_button.setText("رقم التلفون :-");  Panel_3_1.montant_button.setText("كمية الرصيد :-");
            Panel_3_1.Generate_Button.setText("تحويل"); Panel_3_1.choi_d_achat1_Button.setText("رجوع");
            Panel_3_1.jPanel_credit.setBorder(BorderFactory.createTitledBorder(null,"حول رصيدك من هنا ", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-22"), Color.BLUE));
            Panel_3_1.finish_3_1_Button.setText("انهاء");
        }
        Panel_3_1.bank_name1.setText(BankName);
    }//GEN-LAST:event_credit_ButtonActionPerformed

    private void cancel2_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel2_ButtonMouseEntered
        cancel2_Button.setBackground(Color.GREEN);
    }//GEN-LAST:event_cancel2_ButtonMouseEntered

    private void cancel2_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel2_ButtonMouseExited
        cancel2_Button.setBackground(Color.decode("#990066"));
    }//GEN-LAST:event_cancel2_ButtonMouseExited

    private void cancel2_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel2_ButtonActionPerformed
        int test = JOptionPane.showConfirmDialog(null,"Are you sure to close ?","WARNING",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(test==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_cancel2_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bank_name_label;
    public static javax.swing.JPanel Panel_3_5;
    private javax.swing.JTextField account_number_textfield;
    private javax.swing.JTextField balance_textfield;
    public static javax.swing.JButton cancel2_Button;
    public static javax.swing.JLabel choi_de_l_achat;
    public static javax.swing.JButton credit_Button;
    public static javax.swing.JButton electric_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables


}
