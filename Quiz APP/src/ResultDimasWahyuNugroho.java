/*
 * 
 */

/*
 * Result.java
 *
 * 
 */

/**
 *
 * 
 */
import java.sql.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;
public class ResultDimasWahyuNugroho extends javax.swing.JFrame {
    float result;
    String ID;
    /** Creates new form Result */
    public ResultDimasWahyuNugroho() {
        initComponents();
    }
    public ResultDimasWahyuNugroho(float res, String id)
    {
        initComponents();
        result = res;
        ID = id;
        Score.setText(res + "%");
        try {

         /*   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=ELearning.mdb;";
            Connection conn = DriverManager.getConnection(database, "", "");
            Statement stmt = conn.createStatement();  */
             Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/quizdb";
            Connection conn = DriverManager.getConnection(database, "root", "mukesh");
            Statement stmt = conn.createStatement();

            String sql = "select * from Result where ID = '" + ID + "'";
            ResultSet rs = stmt.executeQuery(sql);
            Object[] newrow = new Object[5];
            newrow[0] = "MAX MARKS";
            rs.next();
            for(int i=1; i<=4;i++)
                newrow[i] = rs.getString(i+1);
            DefaultTableModel tm = (DefaultTableModel)scoreTBL.getModel();
            tm.addRow(newrow);
        }
         catch (Exception e) { JOptionPane.showMessageDialog(null,"" + e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scoreTBL = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Result Time");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("YOUR SCORE :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        Score.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Score.setForeground(new java.awt.Color(153, 0, 153));
        Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 70, 40));

        scoreTBL.setBackground(new java.awt.Color(246, 236, 249));
        scoreTBL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(255, 0, 255)));
        scoreTBL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        scoreTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SUBJECT", "JAVA", "DBMS", "HTML", "NETWORKING"}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        scoreTBL.setOpaque(false);
        scoreTBL.setRowHeight(36);
        jScrollPane1.setViewportView(scoreTBL);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 530, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BEST SO FAR:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUIZ APP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        BackBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        BackBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackBTN.setForeground(new java.awt.Color(153, 0, 153));
        BackBTN.setText("<HTML><PRE>TAKE ANOTHER<BR>    QUIZ</PRE></HTML>");
        BackBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        BackBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });
        getContentPane().add(BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 150, 50));

        exitBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        exitBTN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(153, 0, 153));
        exitBTN.setText("EXIT");
        exitBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(exitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 90, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calvin__hobbes-1920x1080.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        new MenuKevinYoelBernhard(ID).setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_BackBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
           this.dispose();
}//GEN-LAST:event_exitBTNActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultDimasWahyuNugroho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JLabel Score;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable scoreTBL;
    // End of variables declaration//GEN-END:variables

}
