/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.register;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Windows
 */
public class ResetPassGUI extends javax.swing.JFrame {
char c[];
char check;
    /**
     * Creates new form ResetPassGUI
     */

    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    int xmouse,ymouse;
    public ResetPassGUI() {
        initComponents();
       LoginGUI l = new LoginGUI();
        Set.setSelected(true);
       
        Color c=new Color(43,43,43);
       
       this.getContentPane().setBackground(c);
       con= Connectpro.dbconnect();

     
        
    }

      public void close()
    {
     WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_oldPass = new javax.swing.JPasswordField();
        txt_newPass = new javax.swing.JPasswordField();
        txt_conPass = new javax.swing.JPasswordField();
        Set = new javax.swing.JCheckBox();
        Back = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Confirm = new javax.swing.JLabel();
        confirm_pass = new javax.swing.JLabel();
        bacK = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reset Password");
        setMinimumSize(new java.awt.Dimension(1024, 708));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(43, 43, 43));
        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 148, 29));
        jLabel1.setText("Old Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 320, 280, 80);

        jLabel2.setBackground(new java.awt.Color(43, 43, 43));
        jLabel2.setFont(new java.awt.Font("Myriad Pro", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 148, 29));
        jLabel2.setText("New Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 410, 320, 49);

        jLabel3.setBackground(new java.awt.Color(43, 43, 43));
        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 148, 29));
        jLabel3.setText("Confirm Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 480, 380, 60);

        txt_oldPass.setBackground(new java.awt.Color(43, 43, 43));
        txt_oldPass.setForeground(new java.awt.Color(247, 148, 29));
        txt_oldPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 148, 29), 2));
        txt_oldPass.setCaretColor(new java.awt.Color(247, 148, 29));
        txt_oldPass.setEchoChar(' ');
        txt_oldPass.setSelectionColor(new java.awt.Color(247, 148, 29));
        txt_oldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_oldPassActionPerformed(evt);
            }
        });
        txt_oldPass.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_oldPassInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txt_oldPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_oldPassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_oldPassKeyTyped(evt);
            }
        });
        getContentPane().add(txt_oldPass);
        txt_oldPass.setBounds(460, 340, 260, 37);

        txt_newPass.setBackground(new java.awt.Color(43, 43, 43));
        txt_newPass.setForeground(new java.awt.Color(247, 148, 29));
        txt_newPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 148, 29), 2));
        txt_newPass.setCaretColor(new java.awt.Color(247, 148, 29));
        txt_newPass.setSelectionColor(new java.awt.Color(247, 148, 29));
        txt_newPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_newPassFocusGained(evt);
            }
        });
        getContentPane().add(txt_newPass);
        txt_newPass.setBounds(460, 420, 260, 37);

        txt_conPass.setBackground(new java.awt.Color(43, 43, 43));
        txt_conPass.setForeground(new java.awt.Color(247, 148, 29));
        txt_conPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 148, 29), 2));
        txt_conPass.setCaretColor(new java.awt.Color(247, 148, 29));
        txt_conPass.setSelectionColor(new java.awt.Color(247, 148, 29));
        getContentPane().add(txt_conPass);
        txt_conPass.setBounds(460, 500, 260, 37);

        Set.setBackground(new java.awt.Color(43, 43, 43));
        Set.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        Set.setForeground(new java.awt.Color(247, 148, 29));
        Set.setText("Set Visible");
        Set.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Set.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SetItemStateChanged(evt);
            }
        });
        Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetActionPerformed(evt);
            }
        });
        getContentPane().add(Set);
        Set.setBounds(150, 560, 210, 40);

        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(462, 47, 0, 0);

        username.setBackground(new java.awt.Color(43, 43, 43));
        username.setForeground(new java.awt.Color(247, 148, 29));
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 148, 29), 2));
        username.setCaretColor(new java.awt.Color(247, 148, 29));
        username.setSelectionColor(new java.awt.Color(247, 148, 29));
        getContentPane().add(username);
        username.setBounds(460, 270, 260, 37);

        jLabel4.setBackground(new java.awt.Color(43, 43, 43));
        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 148, 29));
        jLabel4.setText("Username ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 260, 230, 50);

        Confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmMouseClicked(evt);
            }
        });
        getContentPane().add(Confirm);
        Confirm.setBounds(326, 220, 0, 0);

        confirm_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Labels/confirm.jpg"))); // NOI18N
        confirm_pass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_passMouseClicked(evt);
            }
        });
        getContentPane().add(confirm_pass);
        confirm_pass.setBounds(510, 580, 150, 50);

        bacK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Labels/back.jpg"))); // NOI18N
        bacK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bacK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bacKMouseClicked(evt);
            }
        });
        getContentPane().add(bacK);
        bacK.setBounds(30, 620, 70, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Labels/StellarLogo_1.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(770, 540, 257, 168);

        jLabel6.setBackground(new java.awt.Color(43, 43, 43));
        jLabel6.setFont(new java.awt.Font("Myriad Pro", 0, 65)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(247, 148, 29));
        jLabel6.setText("RESET PASSWORD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 50, 500, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Labels/mini.jpg"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(940, 0, 20, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Labels/close.jpg"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(980, 0, 20, 20);

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1020, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\user\\My Documents\\Downloads\\gateKeeper.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 20, 507, 136);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void SetechoChar()
    {
    
        txt_oldPass.setEchoChar('*');
        txt_newPass.setEchoChar('*');
        txt_conPass.setEchoChar('*');
    }
    
    private void UnSetechoChar()
    {
       
           txt_oldPass.setEchoChar((char)0);
           txt_newPass.setEchoChar((char)0);
           txt_conPass.setEchoChar((char)0);
    }
    
    private void txt_oldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_oldPassActionPerformed

        
    }//GEN-LAST:event_txt_oldPassActionPerformed

    private void txt_oldPassInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_oldPassInputMethodTextChanged

    }//GEN-LAST:event_txt_oldPassInputMethodTextChanged

    private void txt_newPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_newPassFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_newPassFocusGained

    private void txt_oldPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_oldPassKeyTyped
        
             
    }//GEN-LAST:event_txt_oldPassKeyTyped

    private void txt_oldPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_oldPassKeyPressed
         
    }//GEN-LAST:event_txt_oldPassKeyPressed

    private void SetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetActionPerformed

    private void SetItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SetItemStateChanged
        // TODO add your handling code here:
        Boolean b = Set.isSelected();
        
        if(b==true)
        {
            UnSetechoChar();
        }
        else
        {
            SetechoChar();
        }
    }//GEN-LAST:event_SetItemStateChanged

    public void receiveCharReset(char c)
    {
        check=c;
    }
    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
   
    }//GEN-LAST:event_BackMouseClicked

    private void ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_ConfirmMouseClicked

    private void confirm_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm_passMouseClicked
        // TODO add your handling code here:
              LoginGUI l = new LoginGUI();
      if(username.getText().equals("")||txt_oldPass.getText().equals("")||txt_newPass.getText().equals("")||txt_conPass.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"Please enter all the Password fields ","Authentication",2);
      }
      else
      {
                  try {
                               String sql="select * from accdetails Where username=? and password=?";
                               
                              ps=con.prepareStatement(sql);
                              ps.setString(1, username.getText());
                              ps.setString(2, txt_oldPass.getText());
                              rs=ps.executeQuery();
                         if(rs.next())
                        {
                          if(txt_newPass.getText().equals(txt_conPass.getText()))
                          {
                              int choice = JOptionPane.showConfirmDialog(null,"Are you sure with your new Password ","Reset Password",JOptionPane.YES_NO_OPTION,3, null);
                              String pass =txt_newPass.getText();
                              String uname=username.getText();
                              String sql1="update accdetails set password='"+pass+"' where username='"+uname+"'";
                              ps=con.prepareStatement(sql1);
                              ps.execute();
                              if(choice==0)
                              {
                                  JOptionPane.showMessageDialog(null,"New Password Confirmed ", "Authentication",1);
                                  String password = txt_newPass.getText();
                                  LoginGUI l1 = new LoginGUI();
                                  close();
                                  l1.setLocation(470,180);
                                  l1.setVisible(true);
                              }
                              
                              
                          }
                          else
                          {
                              JOptionPane.showMessageDialog(null,"New and Old Passwords do not match ", "Authentication",2);
                          }
                        }
                      else
                      {
                          JOptionPane.showMessageDialog(null,"Invalid Old Password", "Authentication",0);
                          
                          txt_newPass.setText("");
                          txt_conPass.setText("");
                          
                          
                      }       } catch (SQLException ex) {
                      Logger.getLogger(ResetPassGUI.class.getName()).log(Level.SEVERE, null, ex);
                  }
      }    
    }//GEN-LAST:event_confirm_passMouseClicked
   
    private void bacKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bacKMouseClicked
        // TODO add your handling code here:
       
        if(check=='m')
        {
              ManageAccGUI m = new ManageAccGUI();
        
        m.setVisible(true);
        close();
        }
        else if(check=='l')
        {
            LoginGUI l = new LoginGUI();
            l.setVisible(true);
            close();
        }
    }//GEN-LAST:event_bacKMouseClicked

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        // TODO add your handling code here:
        int x= evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jLabel8MouseDragged

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.setState(DeleteAccGUI.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(ResetPassGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPassGUI().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Confirm;
    private javax.swing.JCheckBox Set;
    private javax.swing.JLabel bacK;
    private javax.swing.JLabel confirm_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField txt_conPass;
    private javax.swing.JPasswordField txt_newPass;
    private javax.swing.JPasswordField txt_oldPass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}