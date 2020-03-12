/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.main_frame;

import approve_employee.Approve_Employee;
import hotel_room_management.Hotel_Room_Management;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import myapp.check_in.Check_In;

/**
 *
 * @author Mohammed Al 3mawy
 */
public class Main_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Main_Frame
     */
    public Main_Frame() {
        initComponents();
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
        approve_icon = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        check_out = new javax.swing.JButton();
        new_btn = new javax.swing.JButton();
        edt_btn = new javax.swing.JButton();
        sho_btn = new javax.swing.JButton();
        del_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        close_lbl = new javax.swing.JLabel();
        appr_btn = new javax.swing.JButton();
        notice = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ho_ro_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(40, 120, 200), null));

        approve_icon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        approve_icon.setForeground(new java.awt.Color(40, 120, 200));
        approve_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/icons8-verified-account-48.png"))); // NOI18N
        approve_icon.setText("Hi,");

        user_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        user_name.setForeground(new java.awt.Color(40, 120, 200));
        user_name.setText("User");

        check_out.setBackground(new java.awt.Color(255, 255, 255));
        check_out.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        check_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/icons8-business-report-32.png"))); // NOI18N
        check_out.setText("Check out");
        check_out.setBorderPainted(false);
        check_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                check_outMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                check_outMouseExited(evt);
            }
        });

        new_btn.setBackground(new java.awt.Color(255, 255, 255));
        new_btn.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        new_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/Data-Add-Column-icon.png"))); // NOI18N
        new_btn.setText("Check in");
        new_btn.setBorderPainted(false);
        new_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                new_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new_btnMouseExited(evt);
            }
        });
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });

        edt_btn.setBackground(new java.awt.Color(255, 255, 255));
        edt_btn.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        edt_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/Pencil-icon.png"))); // NOI18N
        edt_btn.setText("   Edit");
        edt_btn.setBorderPainted(false);
        edt_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edt_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edt_btnMouseExited(evt);
            }
        });

        sho_btn.setBackground(new java.awt.Color(255, 255, 255));
        sho_btn.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        sho_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/Programming-Show-Property-icon.png"))); // NOI18N
        sho_btn.setText(" Show");
        sho_btn.setBorderPainted(false);
        sho_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sho_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sho_btnMouseExited(evt);
            }
        });

        del_btn.setBackground(new java.awt.Color(255, 255, 255));
        del_btn.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        del_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/Editing-Delete-icon.png"))); // NOI18N
        del_btn.setText(" Delete");
        del_btn.setBorderPainted(false);
        del_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                del_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                del_btnMouseExited(evt);
            }
        });
        del_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reservation Main Menu");

        jPanel5.setBackground(new java.awt.Color(40, 120, 200));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        close_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        close_lbl.setForeground(new java.awt.Color(255, 255, 255));
        close_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_lbl.setText("X");
        close_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_lblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(close_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(close_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        appr_btn.setBackground(new java.awt.Color(255, 255, 255));
        appr_btn.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        appr_btn.setForeground(new java.awt.Color(255, 255, 255));
        appr_btn.setBorderPainted(false);
        appr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appr_btnActionPerformed(evt);
            }
        });

        notice.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        notice.setForeground(new java.awt.Color(153, 153, 153));
        notice.setText("Notice: non-approval employee can't make any proccess ask admin to approve you");

        jSeparator1.setForeground(new java.awt.Color(40, 120, 200));

        ho_ro_btn.setBackground(new java.awt.Color(255, 255, 255));
        ho_ro_btn.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        ho_ro_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/icons8-hotel-door-hanger-32.png"))); // NOI18N
        ho_ro_btn.setText("       Hotel And Rooms Management");
        ho_ro_btn.setBorderPainted(false);
        ho_ro_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ho_ro_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ho_ro_btnMouseExited(evt);
            }
        });
        ho_ro_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ho_ro_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(approve_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notice)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ho_ro_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(new_btn)
                                    .addComponent(sho_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edt_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(appr_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check_out)
                                    .addComponent(del_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(approve_icon)
                            .addComponent(user_name)
                            .addComponent(notice, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(new_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(check_out, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(appr_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sho_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ho_ro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void close_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lblMouseClicked
        // TODO add your handling code here:
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_close_lblMouseClicked

    private void del_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_del_btnActionPerformed

    private void del_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_btnMouseExited
        // TODO add your handling code here:
    del_btn.setBackground(Color.white);
    }//GEN-LAST:event_del_btnMouseExited

    private void del_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_btnMouseEntered
        // TODO add your handling code here:
    del_btn.setBackground(new Color(40, 120, 200));
    }//GEN-LAST:event_del_btnMouseEntered

    private void sho_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sho_btnMouseExited
        // TODO add your handling code here:
        sho_btn.setBackground(Color.white);
    }//GEN-LAST:event_sho_btnMouseExited

    private void sho_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sho_btnMouseEntered
        // TODO add your handling code here:
        sho_btn.setBackground(new Color(40, 120, 200));
    }//GEN-LAST:event_sho_btnMouseEntered

    private void edt_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edt_btnMouseExited
        // TODO add your handling code here:
        edt_btn.setBackground(Color.white);
    }//GEN-LAST:event_edt_btnMouseExited

    private void edt_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edt_btnMouseEntered
        // TODO add your handling code here:
        edt_btn.setBackground(new Color(40, 120, 200));
    }//GEN-LAST:event_edt_btnMouseEntered

    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed
        // TODO add your handling code here:
        new Check_In().setVisible(true);
    }//GEN-LAST:event_new_btnActionPerformed

    private void new_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_btnMouseExited
        // TODO add your handling code here:
        new_btn.setBackground(Color.white);
    }//GEN-LAST:event_new_btnMouseExited

    private void new_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_btnMouseEntered
        // TODO add your handling code here:
        new_btn.setBackground(new Color(40, 120, 200));
    }//GEN-LAST:event_new_btnMouseEntered

    private void check_outMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_outMouseExited
        // TODO add your handling code here:
        check_out.setBackground(Color.white);
    }//GEN-LAST:event_check_outMouseExited

    private void check_outMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_outMouseEntered
        // TODO add your handling code here:
        check_out.setBackground(new Color(40, 120, 200));
    }//GEN-LAST:event_check_outMouseEntered

    private void appr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appr_btnActionPerformed
        // TODO add your handling code here:
        new Approve_Employee().setVisible(true);
    }//GEN-LAST:event_appr_btnActionPerformed

    private void ho_ro_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ho_ro_btnMouseEntered
        // TODO add your handling code here:
        ho_ro_btn.setBackground(new Color(40, 120, 200));
    }//GEN-LAST:event_ho_ro_btnMouseEntered

    private void ho_ro_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ho_ro_btnMouseExited
        // TODO add your handling code here:
        ho_ro_btn.setBackground(Color.white);
    }//GEN-LAST:event_ho_ro_btnMouseExited

    private void ho_ro_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ho_ro_btnActionPerformed
        // TODO add your handling code here:
        new Hotel_Room_Management().setVisible(true);
    }//GEN-LAST:event_ho_ro_btnActionPerformed

    public void admin(String name){
    approve_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/icons8-verified-account-48.png")));
    user_name.setText(name);
    notice.setText("");
    appr_btn.setBackground(new java.awt.Color(40, 120, 200));
        appr_btn.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        appr_btn.setForeground(Color.black);
        appr_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/verified-account-32.png"))); // NOI18N
        appr_btn.setText("Verify");
        appr_btn.setBorderPainted(false);
        appr_btn.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                rep_btnMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                rep_btnMouseExited(evt);
//            }
        });
    }
    
    public void approved_emp(String name){
    approve_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/icons8-verified-account-48.png")));
    user_name.setText(name);
    notice.setText("");
    }
    
    public void not_approved_emp(String name){
     jPanel1.setBorder(BorderFactory.createEtchedBorder(Color.red, null));
     jPanel5.setBackground(Color.red);
     jSeparator1.setBackground(Color.red);
     jSeparator1.setForeground(Color.red);
    approve_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/assets/red-verified-account-48.png")));
    approve_icon.setForeground(Color.red);
    user_name.setText(name);
    user_name.setForeground(Color.red);
    edt_btn.setEnabled(false);
    new_btn.setEnabled(false);
    check_out.setEnabled(false);
    sho_btn.setEnabled(false);
    appr_btn.setEnabled(false);
    del_btn.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appr_btn;
    private javax.swing.JLabel approve_icon;
    private javax.swing.JButton check_out;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JButton del_btn;
    private javax.swing.JButton edt_btn;
    private javax.swing.JButton ho_ro_btn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton new_btn;
    private javax.swing.JLabel notice;
    private javax.swing.JButton sho_btn;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}