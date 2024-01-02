import java.sql.*;
import javax.swing.JOptionPane;
public class RegisterDimasWahyuNugroho extends javax.swing.JFrame {

    /** Creates new form Register */
    public RegisterDimasWahyuNugroho() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CollegeTf = new javax.swing.JTextField();
        DobTF = new javax.swing.JTextField();
        AgeTF = new javax.swing.JTextField();
        NameTF = new javax.swing.JTextField();
        MaleRB = new javax.swing.JRadioButton();
        FemaleRB = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        AddressTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        UnivTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        IDTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PasswordTf = new javax.swing.JTextField();
        RegisterTF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUIZ APP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, -1));

        jLabel4.setBackground(new java.awt.Color(242, 233, 237));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 60, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<HTML>Date Of<Br>Birth</HTML>");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, 30));

        jLabel7.setBackground(new java.awt.Color(249, 239, 242));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Age");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 40, 20));

        CollegeTf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CollegeTf.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(CollegeTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 390, -1));

        DobTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DobTF.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(DobTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 120, -1));

        AgeTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AgeTF.setForeground(new java.awt.Color(153, 0, 153));
        AgeTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AgeTFKeyTyped(evt);
            }
        });
        getContentPane().add(AgeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 120, -1));

        NameTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameTF.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(NameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 120, -1));

        buttonGroup1.add(MaleRB);
        MaleRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MaleRB.setForeground(new java.awt.Color(153, 0, 153));
        MaleRB.setText("Male");
        MaleRB.setOpaque(false);
        getContentPane().add(MaleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        buttonGroup1.add(FemaleRB);
        FemaleRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FemaleRB.setForeground(new java.awt.Color(153, 0, 153));
        FemaleRB.setText("Female");
        FemaleRB.setOpaque(false);
        getContentPane().add(FemaleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        jLabel9.setBackground(new java.awt.Color(249, 239, 242));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("University");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, 20));

        AddressTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddressTF.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(AddressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 390, -1));

        jLabel10.setBackground(new java.awt.Color(249, 239, 242));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("College");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 60, -1));

        UnivTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UnivTF.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(UnivTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 390, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("REGISTRATION FORM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("User ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 70, 20));

        IDTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDTF.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(IDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Password");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 80, 20));

        PasswordTf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PasswordTf.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(PasswordTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 120, -1));

        RegisterTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterTF.setForeground(new java.awt.Color(153, 0, 153));
        RegisterTF.setText("<HTML>REGISTER &<br>START TEST </html>");
        RegisterTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(241, 236, 249), java.awt.Color.pink, new java.awt.Color(153, 0, 153), null));
        RegisterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterTFActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 140, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calvin__hobbes-1920x1080.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterTFActionPerformed
         try {
             int age = Integer.parseInt(AgeTF.getText());
             char Gender = 'M';
             if(FemaleRB.isSelected())
                 Gender = 'F';
             /*
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String database =
                    "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=ELearning.mdb;";
            Connection conn = DriverManager.getConnection(database, "", "");
            Statement stmt = conn.createStatement();  */
                         Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/quizdb";
            Connection conn = DriverManager.getConnection(database, "root", "mukesh");
            Statement stmt = conn.createStatement();

            String sql = "insert into StudInfo values ( '" + NameTF.getText() + "', " + age + ", '" + DobTF.getText() + "' , '" + Gender + "' , '" + AddressTF.getText() + "' , '" + CollegeTf.getText() + "' , '" + UnivTF.getText() + "' , '" + IDTF.getText() + "' )" ;
            stmt.executeUpdate(sql);
            sql = "insert into Result values ( '" + IDTF.getText() + "', 0 , 0 , 0 , 0)";
            stmt.executeUpdate(sql);
            sql = "insert into LogIn values ( '" + IDTF.getText() + "' , '" + PasswordTf.getText() + "' )";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            new MenuKevinYoelBernhard(IDTF.getText()).setVisible(true);
            this.setVisible(false);
        }
        catch( Exception e)
        {
             JOptionPane.showMessageDialog(null,"" + e);
        }
}//GEN-LAST:event_RegisterTFActionPerformed

    private void AgeTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeTFKeyTyped
        //char ch = evt.getKeyChar();
       // String str = AgeTF.getText();
       // if(!Character.isDigit(ch))
       //     AgeTF.setText(str.substring(0,str.length()-1));
    }//GEN-LAST:event_AgeTFKeyTyped

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDimasWahyuNugroho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTF;
    private javax.swing.JTextField AgeTF;
    private javax.swing.JTextField CollegeTf;
    private javax.swing.JTextField DobTF;
    private javax.swing.JRadioButton FemaleRB;
    private javax.swing.JTextField IDTF;
    private javax.swing.JRadioButton MaleRB;
    private javax.swing.JTextField NameTF;
    private javax.swing.JTextField PasswordTf;
    private javax.swing.JButton RegisterTF;
    private javax.swing.JTextField UnivTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
