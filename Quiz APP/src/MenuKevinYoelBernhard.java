
public class MenuKevinYoelBernhard extends javax.swing.JFrame {
    String ID;
        /** Creates new form Menu */
    public MenuKevinYoelBernhard() {
        initComponents();
    }
    public MenuKevinYoelBernhard(String id) {
        initComponents();
        ID = id;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JavaRB = new javax.swing.JRadioButton();
        DbmsRB = new javax.swing.JRadioButton();
        HtmlRB = new javax.swing.JRadioButton();
        NetworkingRB = new javax.swing.JRadioButton();
        startTestBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Select Your Subject");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("WELCOME TO QUIZ APP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SELECT YOUR SUBJECT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        JavaRB.setBackground(new java.awt.Color(248, 246, 244));
        buttonGroup1.add(JavaRB);
        JavaRB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JavaRB.setForeground(new java.awt.Color(153, 0, 153));
        JavaRB.setText("JAVA");
        JavaRB.setOpaque(false);
        JavaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaRBActionPerformed(evt);
            }
        });
        getContentPane().add(JavaRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        DbmsRB.setBackground(new java.awt.Color(248, 246, 244));
        buttonGroup1.add(DbmsRB);
        DbmsRB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DbmsRB.setForeground(new java.awt.Color(153, 0, 153));
        DbmsRB.setText("DBMS");
        DbmsRB.setOpaque(false);
        getContentPane().add(DbmsRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        HtmlRB.setBackground(new java.awt.Color(248, 246, 244));
        buttonGroup1.add(HtmlRB);
        HtmlRB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HtmlRB.setForeground(new java.awt.Color(153, 0, 153));
        HtmlRB.setText("HTML");
        HtmlRB.setOpaque(false);
        getContentPane().add(HtmlRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        NetworkingRB.setBackground(new java.awt.Color(248, 246, 244));
        buttonGroup1.add(NetworkingRB);
        NetworkingRB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NetworkingRB.setForeground(new java.awt.Color(153, 0, 153));
        NetworkingRB.setText("NETWORKING");
        NetworkingRB.setOpaque(false);
        getContentPane().add(NetworkingRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        startTestBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        startTestBTN.setForeground(new java.awt.Color(153, 0, 153));
        startTestBTN.setText("START TEST >>");
        startTestBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(241, 236, 249), java.awt.Color.pink, new java.awt.Color(153, 0, 153), null));
        startTestBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTestBTNActionPerformed(evt);
            }
        });
        getContentPane().add(startTestBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 140, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calvin__hobbes-1920x1080.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTestBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTestBTNActionPerformed
        // TODO add your handling code here:
        String sub = null;
        if(JavaRB.isSelected())
            sub = "java";
        else if(DbmsRB.isSelected())
            sub = "dbms";
        else if(HtmlRB.isSelected())
            sub = "html";
        else if(NetworkingRB.isSelected())
            sub = "networking";
        if (sub != null)
        {
            TestFadhlurRahman t = new TestFadhlurRahman(sub,ID);
            t.setVisible(true);
            this.setVisible(false);
        }
}//GEN-LAST:event_startTestBTNActionPerformed

    private void JavaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JavaRBActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuKevinYoelBernhard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DbmsRB;
    private javax.swing.JRadioButton HtmlRB;
    private javax.swing.JRadioButton JavaRB;
    private javax.swing.JRadioButton NetworkingRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton startTestBTN;
    // End of variables declaration//GEN-END:variables

}
