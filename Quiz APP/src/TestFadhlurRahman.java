
import java.sql.*;
import javax.swing.JOptionPane;
public class TestFadhlurRahman extends javax.swing.JFrame {
    String ID;
    String Subject;
    int index =1;
    int max =0;
    int result = 0;
    char [] answers;
    /** Creates new form Test */
    public TestFadhlurRahman()
    {
        initComponents();
    }
    public TestFadhlurRahman(String subject, String id)
    {
        initComponents();
        ID = id;
        Subject = subject;
        PrevBTN.setVisible(false);
        try
          {

        /*     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String database ="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=ELearning.mdb;";
            Connection conn = DriverManager.getConnection(database, "", "");
            Statement stmt = conn.createStatement(); */
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/quizdb";
            Connection conn = DriverManager.getConnection(database, "root", "mukesh");
            Statement stmt = conn.createStatement();

            String sql = "select max(SNo) from " + Subject;
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            max = rs.getInt(1);
            answers = new char[max];
            for(int i=0; i<max;i++)
                answers[i] = 'e';
            rs.close();
            stmt.close();
            conn.close();
            getQues();
             }
             catch(Exception e){ JOptionPane.showMessageDialog(null,""+ e);
          }
    }
    private void getQues()
    {
        try
        {
        /*    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String database ="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=ELearning.mdb;";
            Connection conn = DriverManager.getConnection(database, "", "");
            Statement stmt = conn.createStatement(); */
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/quizdb";
            Connection conn = DriverManager.getConnection(database, "root", "mukesh");
            Statement stmt = conn.createStatement();

            String sql = "select * from " + Subject + " where SNo = " + index;
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            QuesTA.setText("\nQ" + index + ".  " + rs.getString(2));
            a.setText(rs.getString("a"));
            b.setText(rs.getString("b"));
            c.setText(rs.getString("c"));
            d.setText(rs.getString("d"));
            a.setSelected(answers[index-1] == 'a');
            b.setSelected(answers[index-1] == 'b');
            c.setSelected(answers[index-1] == 'c');
            d.setSelected(answers[index-1] == 'd');
            e.setSelected(answers[index-1] == 'e');
            rs.close();
            stmt.close();
            conn.close();
        }
         catch(Exception e){ JOptionPane.showMessageDialog(null,""+ e); }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        a = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        c = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        QuesTA = new javax.swing.JTextArea();
        PrevBTN = new javax.swing.JButton();
        NextBTN = new javax.swing.JButton();
        ResultBTN = new javax.swing.JButton();
        d = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        e = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz Time");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUIZ APP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        buttonGroup1.add(a);
        a.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a.setForeground(new java.awt.Color(102, 0, 102));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setOpaque(false);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        buttonGroup1.add(b);
        b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b.setForeground(new java.awt.Color(102, 0, 102));
        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setOpaque(false);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        buttonGroup1.add(c);
        c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c.setForeground(new java.awt.Color(102, 0, 102));
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setOpaque(false);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAlignmentX(5.0F);
        jScrollPane1.setAlignmentY(5.0F);

        QuesTA.setEditable(false);
        QuesTA.setBackground(new java.awt.Color(248, 241, 244));
        QuesTA.setColumns(20);
        QuesTA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QuesTA.setForeground(new java.awt.Color(153, 0, 153));
        QuesTA.setLineWrap(true);
        QuesTA.setRows(3);
        QuesTA.setWrapStyleWord(true);
        QuesTA.setAutoscrolls(false);
        QuesTA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        jScrollPane1.setViewportView(QuesTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 460, 100));

        PrevBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        PrevBTN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PrevBTN.setForeground(new java.awt.Color(153, 0, 153));
        PrevBTN.setText("<< Prev");
        PrevBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        PrevBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevBTNActionPerformed(evt);
            }
        });
        getContentPane().add(PrevBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, 40));

        NextBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        NextBTN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        NextBTN.setForeground(new java.awt.Color(153, 0, 153));
        NextBTN.setText("Next >>");
        NextBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        NextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBTNActionPerformed(evt);
            }
        });
        getContentPane().add(NextBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 90, 40));

        ResultBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        ResultBTN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ResultBTN.setForeground(new java.awt.Color(153, 0, 153));
        ResultBTN.setText("GEt RESULT");
        ResultBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        ResultBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ResultBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 140, 40));

        buttonGroup1.add(d);
        d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        d.setForeground(new java.awt.Color(102, 0, 102));
        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setOpaque(false);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kss.JPG"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        buttonGroup1.add(e);
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 10, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrevBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevBTNActionPerformed
            index--;
            getQues();
            if(index == 1)
                PrevBTN.setVisible(false);
            if(index < max)
                NextBTN.setVisible(true);
}//GEN-LAST:event_PrevBTNActionPerformed

    private void NextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBTNActionPerformed
            index++;
            getQues();
            if(index == max)
                NextBTN.setVisible(false);
            if(index > 1)
                PrevBTN.setVisible(true);
}//GEN-LAST:event_NextBTNActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        answers[index-1] = 'b';
}//GEN-LAST:event_bActionPerformed

    private void ResultBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultBTNActionPerformed
        try
        {
         /* Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String database ="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=ELearning.mdb;";
            Connection conn = DriverManager.getConnection(database, "", "");
            Statement stmt = conn.createStatement(); */
              Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/quizdb";
            Connection conn = DriverManager.getConnection(database, "root", "mukesh");
            Statement stmt = conn.createStatement();

            String sql = "select Result from " + Subject;
            ResultSet rs = stmt.executeQuery(sql);
            int i = 0;
            while(rs.next())
            {
                char ans = rs.getString(1).charAt(0);
                if(ans == answers[i])
                    result++;
                i++;
            }
            float res = ((float)result * 100 ) / max;
            sql = "Select " + Subject + "Result from Result where ID = '" + ID + "'";
            rs = stmt.executeQuery(sql);
            rs.next();
            if(res > rs.getFloat(1))
            {
                sql = "update Result set " + Subject + "Result = " + res + " where ID = '" + ID + "'";
                stmt.executeUpdate(sql);
            }
            stmt.close();
            conn.close();
            new ResultDimasWahyuNugroho(res,ID).setVisible(true);
            this.setVisible(false);
        }
         catch(Exception e){ JOptionPane.showMessageDialog(null,""+ e); }
}//GEN-LAST:event_ResultBTNActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        answers[index-1] = 'a';
    }//GEN-LAST:event_aActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        answers[index-1] = 'c';
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        answers[index-1] = 'd';
    }//GEN-LAST:event_dActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFadhlurRahman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NextBTN;
    private javax.swing.JButton PrevBTN;
    private javax.swing.JTextArea QuesTA;
    private javax.swing.JButton ResultBTN;
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton c;
    private javax.swing.JRadioButton d;
    private javax.swing.JRadioButton e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
