/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mtn_atm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.border.TitledBorder;


/**
 *
 * @author Idrisse_Rose
 */
public class Panel_1 extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form Panel_1
     */
    int i=18,x=1 ;
    int x_end=4;
    Timer tm;
    int test = 0, counter=5;
   static  JFrame f ;
    public Panel_1() {
        initComponents();
        f = new JFrame("MTN_ATM");
        f.add(this);
        tm = new Timer(2,this);
        
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 5));
       
    }
    
    String wellcome="Welcome";
     public void paintComponent(Graphics g)
    { super.paintComponent(g);
        tm.start();
     try {
        g.setFont(new Font("Times new roman",Font.BOLD,120));
        g.setColor(Color.BLUE);
        g.drawString(wellcome, x,140);
        Thread.sleep(15);
        
         }catch(Exception e){}
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
        jPanel2 = new javax.swing.JPanel();
        french_Buton = new javax.swing.JButton();
        english_button = new javax.swing.JButton();
        Arabic_Buton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true), "Please choose a language", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        french_Buton.setBackground(new java.awt.Color(153, 0, 102));
        french_Buton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        french_Buton.setForeground(new java.awt.Color(255, 255, 255));
        french_Buton.setText("Français");
        french_Buton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                french_ButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                french_ButonMouseExited(evt);
            }
        });
        french_Buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                french_ButonActionPerformed(evt);
            }
        });
        jPanel2.add(french_Buton);

        english_button.setBackground(new java.awt.Color(153, 0, 102));
        english_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        english_button.setForeground(new java.awt.Color(255, 255, 255));
        english_button.setText("English");
        english_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                english_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                english_buttonMouseExited(evt);
            }
        });
        english_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                english_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(english_button);

        Arabic_Buton.setBackground(new java.awt.Color(153, 0, 102));
        Arabic_Buton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Arabic_Buton.setForeground(new java.awt.Color(255, 255, 255));
        Arabic_Buton.setText("عـربـي");
        Arabic_Buton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Arabic_ButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Arabic_ButonMouseExited(evt);
            }
        });
        Arabic_Buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Arabic_ButonActionPerformed(evt);
            }
        });
        jPanel2.add(Arabic_Buton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(54, 54, 54)))
                    .addGap(25, 25, 25)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(176, 176, 176)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void french_ButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_french_ButonMouseEntered
        french_Buton.setBackground(Color.GREEN);
    }//GEN-LAST:event_french_ButonMouseEntered

    private void french_ButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_french_ButonMouseExited
        french_Buton.setBackground(Color.decode("#990066"));
    }//GEN-LAST:event_french_ButonMouseExited

    private void french_ButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_french_ButonActionPerformed
      //  new Frame2().setVisible(true );
        new Panel_2();
        this.setVisible(false);

        Panel_2.account_no.setText("Numero du compte :-");
        Panel_2.passWord.setText("Mot de passe :-");
        Panel_2.back_buton.setText("Retour");
        Panel_2.enter_button.setText("Entrer");
        Panel_2.cancel1_button.setText("Annuler");
        Panel_2.welcome_label_string="Bienvenue";
        Panel_2.Panel_login.setBorder(BorderFactory.createTitledBorder(null,"Veuillez entrer votre numero de compte et mot de passe", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-15"), Color.BLUE));
        Panel_2.proof1.setText("C'est vide ");
        Panel_2.proof2.setText("Incorrect");
    }//GEN-LAST:event_french_ButonActionPerformed

    private void english_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_english_buttonMouseEntered
        english_button.setBackground(Color.GREEN);
    }//GEN-LAST:event_english_buttonMouseEntered

    private void english_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_english_buttonMouseExited
        english_button.setBackground(Color.decode("#990066"));
    }//GEN-LAST:event_english_buttonMouseExited

    private void english_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_english_buttonActionPerformed
       // new Frame2().setVisible(true );
        new Panel_2();
        this.setVisible(false);
        Panel_2.account_no.setText("Account number :-");
        Panel_2.passWord.setText("Pass word :-");
        Panel_2.back_buton.setText("Back");
        Panel_2.enter_button.setText("Enter");
        Panel_2.cancel1_button.setText("Cancel");
        Panel_2.welcome_label_string="Wellcome";
        Panel_2.Panel_login.setBorder(BorderFactory.createTitledBorder(null,"Please enter your account number and password", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-18"), Color.BLUE));
        Panel_2.proof1.setText("It's empty ");
        Panel_2.proof2.setText("Incorrect");
    }//GEN-LAST:event_english_buttonActionPerformed

    private void Arabic_ButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Arabic_ButonMouseEntered
        Arabic_Buton.setBackground(Color.GREEN);
    }//GEN-LAST:event_Arabic_ButonMouseEntered

    private void Arabic_ButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Arabic_ButonMouseExited
        Arabic_Buton.setBackground(Color.decode("#990066"));
    }//GEN-LAST:event_Arabic_ButonMouseExited

    private void Arabic_ButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Arabic_ButonActionPerformed
        // TODO add your handling code here:
        new Panel_2();
        this.setVisible(false);
        Panel_2.account_no.setText("رقم الحساب");
        Panel_2.passWord.setText("كلمة السر");
        Panel_2.back_buton.setText("رجوع");
        Panel_2.enter_button.setText("ادخال");
        Panel_2.cancel1_button.setText("الغاء");
        Panel_2.welcome_label_string="مــرحــبا";
        Panel_2.Panel_login.setBorder(BorderFactory.createTitledBorder(null,"الرجاء ادخال رقم الحساب و كلمة السر الخاصة بك", TitledBorder.CENTER, TitledBorder.TOP, Font.decode("Times New Roman-BOLD-18"), Color.BLUE));
        Panel_2.proof1.setText("فـارغـة");
        Panel_2.proof2.setText("غير صحيح");

    }//GEN-LAST:event_Arabic_ButonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arabic_Buton;
    private javax.swing.JButton english_button;
    private javax.swing.JButton french_Buton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
         try {
            if (x<0 || x>=110)
                x_end = -x_end;
           
            x+=x_end;
            
            repaint();
          Thread.sleep(50);
            
        }catch(Exception et){}
        }

}
