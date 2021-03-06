package ac.za.cput.controlclerkform;

import ac.za.cput.entity.generic.University;
import ac.za.cput.entity.user.ControlClerk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

/**
 * @author Athenkosi Mjekula
 */
public class RegisterClerk extends JFrame {
    // Variables declaration - do not modify
    private JLabel alreadyHaveAccountTxt, alreadyHaveAccountTxt1, backLblBtn,
                     universityOrCampusTxt, universityOrCampusTxt1, universityOrCampusTxt2,
                     universityOrCampusTxt3, universityOrCampusTxt4;
    public JTextField emailTxtF, jTextField1, phoneNumTxtF, surnameTxtF;
    private JLabel jLabel1, jLabel10, jLabel11, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6,
                    jLabel7, jLabel8, jLabel9, newControlClerkTxt;
    private JPanel jPanel1, jPanel2;
    private JButton regBtn;
    public JLabel universityLogo;
    University university;
    // End of variables declaration

    /**
     * Creates new form CreateClerkForm
     */
    public RegisterClerk() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        universityLogo = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel3 = new JLabel();
        alreadyHaveAccountTxt = new JLabel();
        newControlClerkTxt = new JLabel();
        jLabel2 = new JLabel();
        universityOrCampusTxt = new JLabel();
        regBtn = new JButton();
        universityOrCampusTxt1 = new JLabel();
        jTextField1 = new JTextField();
        surnameTxtF = new JTextField();
        universityOrCampusTxt2 = new JLabel();
        universityOrCampusTxt3 = new JLabel();
        backLblBtn = new JLabel();
        alreadyHaveAccountTxt1 = new JLabel();
        universityOrCampusTxt4 = new JLabel();
        phoneNumTxtF = new JTextField();
        jLabel1 = new JLabel();
        emailTxtF = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        jPanel2.setBackground(new Color(0, 101, 204));

        universityLogo.setIcon(new ImageIcon("Inventory Default Logo.png")); // NOI18N
        universityLogo.setHorizontalTextPosition(SwingConstants.CENTER);

        jLabel4.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("The goal is not to improve one measurement in ");

        jLabel5.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("isolation. The goal is to reduce operational");

        jLabel6.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("expenses & reduce inventories and increase ");

        jLabel7.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("throughput simultaneously.");

        jLabel8.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Eliyahu M. Goldratt");

        jLabel9.setIcon(new ImageIcon("approval_96px.png")); // NOI18N

        jLabel10.setIcon(new ImageIcon("quote_left_96px.png")); // NOI18N

        jLabel11.setIcon(new ImageIcon("quote.png")); // NOI18N

        jLabel3.setFont(new Font("SansSerif", 1, 28)); // NOI18N
        jLabel3.setForeground(new Color(0, 204, 204));
        jLabel3.setText("Inventory Management System");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addGap(15, 15, 15))))
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(universityLogo, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(universityLogo, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel11)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(164, 164, 164))
        );

        alreadyHaveAccountTxt.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        alreadyHaveAccountTxt.setForeground(new Color(204, 204, 204));
        alreadyHaveAccountTxt.setText("STEP 02/03");

        newControlClerkTxt.setFont(new Font("SansSerif", 1, 30)); // NOI18N
        newControlClerkTxt.setText("Register Control Clerk!");

        jLabel2.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new Color(153, 153, 153));
        jLabel2.setText("For the purpose of industry revolution, your details                       ");

        universityOrCampusTxt.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        universityOrCampusTxt.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt.setText("Your name*");

        regBtn.setBackground(new Color(14, 68, 240));
        regBtn.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        regBtn.setForeground(new Color(255, 255, 255));
        regBtn.setText("Save & Continue");
        regBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        regBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                regBtnMouseEntered(evt);
            }
        });
        regBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    regBtnActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        universityOrCampusTxt1.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        universityOrCampusTxt1.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt1.setText("are required.");

        jTextField1.setFont(new Font("SansSerif", 0, 14)); // NOI18N

        surnameTxtF.setFont(new Font("SansSerif", 0, 14)); // NOI18N

        universityOrCampusTxt2.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        universityOrCampusTxt2.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt2.setText("Your surname*");

        universityOrCampusTxt3.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        universityOrCampusTxt3.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt3.setText("Your phone number*");

        backLblBtn.setFont(new Font("SansSerif", 1, 12)); // NOI18N
        backLblBtn.setForeground(new Color(153, 153, 153));
        backLblBtn.setText("<   Back");
        backLblBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backLblBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                try {
                    backLblBtnMouseClicked(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            public void mouseEntered(MouseEvent evt) {
                backLblBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                backLblBtnMouseExited(evt);
            }
        });

        alreadyHaveAccountTxt1.setFont(new Font("SansSerif", 0, 12)); // NOI18N
        alreadyHaveAccountTxt1.setForeground(new Color(102, 102, 102));
        alreadyHaveAccountTxt1.setText("Personal Info.");

        universityOrCampusTxt4.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        universityOrCampusTxt4.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt4.setText("Your email address");

        phoneNumTxtF.setFont(new Font("SansSerif", 0, 14)); // NOI18N

        jLabel1.setFont(new Font("SansSerif", 0, 14)); // NOI18N

        emailTxtF.setFont(new Font("SansSerif", 0, 14)); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(backLblBtn)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(alreadyHaveAccountTxt1)
                            .addComponent(alreadyHaveAccountTxt))
                        .addGap(87, 87, 87))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(universityOrCampusTxt2)
                            .addComponent(universityOrCampusTxt1)
                            .addComponent(newControlClerkTxt)
                            .addComponent(jLabel2)
                            .addComponent(universityOrCampusTxt)
                            .addComponent(universityOrCampusTxt3)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(emailTxtF, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(phoneNumTxtF, GroupLayout.Alignment.LEADING)
                                .addComponent(surnameTxtF, GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, GroupLayout.Alignment.LEADING)
                                .addComponent(universityOrCampusTxt4, GroupLayout.Alignment.LEADING)))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(regBtn, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(alreadyHaveAccountTxt)
                        .addGap(9, 9, 9)
                        .addComponent(alreadyHaveAccountTxt1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(backLblBtn)))
                .addGap(48, 48, 48)
                .addComponent(newControlClerkTxt)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universityOrCampusTxt1)
                .addGap(18, 18, 18)
                .addComponent(universityOrCampusTxt)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(universityOrCampusTxt2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameTxtF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(universityOrCampusTxt3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumTxtF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(universityOrCampusTxt4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxtF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(regBtn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void regBtnActionPerformed(ActionEvent evt) throws IOException, InterruptedException {
        CompleteClerkProfile clerkProfile = new CompleteClerkProfile();

        String name = jTextField1.getText().trim();
        String surname = surnameTxtF.getText().trim();
        String email = emailTxtF.getText().trim();
        String phoneNo = phoneNumTxtF.getText().trim();

        if(name.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your name");

        }else if(surname.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your surname");

        }else if(phoneNo.trim().equals("") || phoneNo.trim().length() < 10 || phoneNo.trim().length() > 10
                && email.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Phone number or email doesn't exist");

        }else{
            clerkProfile.setVisible(true);
            clerkProfile.email = email;
            clerkProfile.name = name;
            clerkProfile.surname = surname;
            clerkProfile.phoneNum = phoneNo;
            clerkProfile.university = this.university;
            clerkProfile.universityLogo.setIcon(this.universityLogo.getIcon());
            clerkProfile.pack();
            clerkProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }

    private void backLblBtnMouseClicked(MouseEvent evt) throws IOException, InterruptedException {
        CreateClerkForm createClerk = new CreateClerkForm();
        createClerk.setVisible(true);
        createClerk.universityLogo.setIcon(this.universityLogo.getIcon());
        createClerk.pack();
        createClerk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void regBtnMouseEntered(MouseEvent evt) {
        regBtn.setBackground(new Color(0, 101, 183));
    }

    private void backLblBtnMouseEntered(MouseEvent evt) {
        backLblBtn.setForeground(new Color(0, 101, 183));
    }

    private void backLblBtnMouseExited(MouseEvent evt) {
        backLblBtn.setForeground(new Color(153,153,153));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterClerk().setVisible(true);
            }
        });
    }
}
