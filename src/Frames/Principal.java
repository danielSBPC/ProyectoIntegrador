package Frames;

import Paneles.Admin1;
import Paneles.Admin2;
import Paneles.Admin3;
import accesoBBDD.GimnasioPersistencia;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Monitor;
import model.Usuario;

public class Principal extends javax.swing.JFrame {

    private final GimnasioPersistencia gimPersi;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        gimPersi = new GimnasioPersistencia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boton3 = new javax.swing.JButton();
        labelTwitter = new javax.swing.JLabel();
        boton2 = new javax.swing.JButton();
        labelYoutube = new javax.swing.JLabel();
        labelLinkedin = new javax.swing.JLabel();
        labelFacebook = new javax.swing.JLabel();
        labelGithub = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jpCabecera = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelMinimizar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpLateral.setBackground(new java.awt.Color(255, 255, 255));
        jpLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpLateral.setForeground(new java.awt.Color(255, 255, 255));
        jpLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pesa-100.png"))); // NOI18N
        jpLateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, 90));

        boton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boton3.setForeground(new java.awt.Color(0, 51, 153));
        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoReg.png"))); // NOI18N
        boton3.setText("Registros");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jpLateral.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 60));

        labelTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoTwit.png"))); // NOI18N
        labelTwitter.setText("twit");
        labelTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTwitterMouseClicked(evt);
            }
        });
        jpLateral.add(labelTwitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 50, 50));

        boton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boton2.setForeground(new java.awt.Color(0, 51, 153));
        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoUsu3.png"))); // NOI18N
        boton2.setText("Usuarios");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jpLateral.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 230, 60));

        labelYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoYou.png"))); // NOI18N
        labelYoutube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelYoutubeMouseClicked(evt);
            }
        });
        jpLateral.add(labelYoutube, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 50, 50));

        labelLinkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconLink.png"))); // NOI18N
        labelLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLinkedinMouseClicked(evt);
            }
        });
        jpLateral.add(labelLinkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, 50));

        labelFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoFace.png"))); // NOI18N
        labelFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelFacebookMouseClicked(evt);
            }
        });
        jpLateral.add(labelFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 50, 50));

        labelGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoGithub2.png"))); // NOI18N
        labelGithub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGithubMouseClicked(evt);
            }
        });
        jpLateral.add(labelGithub, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 60, 60));

        boton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boton1.setForeground(new java.awt.Color(0, 51, 153));
        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoCinta.png"))); // NOI18N
        boton1.setText("Cardio");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jpLateral.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, 60));

        boton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boton4.setForeground(new java.awt.Color(0, 51, 153));
        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoMusc.png"))); // NOI18N
        boton4.setText("Musculación");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        jpLateral.add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 230, 60));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("We Fitness");
        jpLateral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, 30));

        getContentPane().add(jpLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 580));

        jpCabecera.setBackground(new java.awt.Color(255, 255, 255));
        jpCabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Multiply_32px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jpCabecera.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 40, 40));

        labelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        labelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseClicked(evt);
            }
        });
        jpCabecera.add(labelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 40, 40));

        getContentPane().add(jpCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 910, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("BIENVENIDO A MY FIT PLAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel2)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cambiarPanel(JPanel panel) {
        this.jPanel1.removeAll();
        this.jPanel1.add(panel, BorderLayout.CENTER);
        this.jPanel1.revalidate();
        this.jPanel1.repaint();
    }

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        Admin2 a2 = new Admin2();
        a2.setSize(910, 520);
        a2.setLocation(0, 0);

        cambiarPanel(a2);
        a2.cargarTablaUsuario(gimPersi.consultaUsuario());
    }//GEN-LAST:event_boton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea Salir del My Fit Plan?", "Exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void labelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_labelMinimizarMouseClicked

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        Admin3 a3 = new Admin3();
        a3.setSize(910, 520);
        a3.setLocation(0, 0);
        cambiarPanel(a3);
    }//GEN-LAST:event_boton3ActionPerformed

    public void abrirInternet(String pagina) {
        try {
            Desktop.getDesktop().browse(URI.create(pagina));
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }

    private void labelYoutubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelYoutubeMouseClicked
        this.abrirInternet("https://www.youtube.com/");
    }//GEN-LAST:event_labelYoutubeMouseClicked

    private void labelTwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTwitterMouseClicked
        this.abrirInternet("https://twitter.com/?lang=es");
    }//GEN-LAST:event_labelTwitterMouseClicked

    private void labelLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLinkedinMouseClicked
        this.abrirInternet("https://es.linkedin.com/");
    }//GEN-LAST:event_labelLinkedinMouseClicked

    private void labelFacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFacebookMouseClicked
        this.abrirInternet("https://www.facebook.com");
    }//GEN-LAST:event_labelFacebookMouseClicked

    private void labelGithubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGithubMouseClicked
        this.abrirInternet("https://github.com");
    }//GEN-LAST:event_labelGithubMouseClicked

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        Admin1 a1 = new Admin1();
        a1.setSize(910, 520);
        a1.setLocation(0, 0);

        cambiarPanel(a1);
        a1.cargarTablaEjercicio(gimPersi.consultaEjercicioPorTipo("Cardio"));
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        Admin1 a1 = new Admin1();
        a1.setSize(910, 520);
        a1.setLocation(0, 0);

        cambiarPanel(a1);
        a1.cargarTablaEjercicio(gimPersi.consultaEjercicioPorTipo("Musculación"));
    }//GEN-LAST:event_boton4ActionPerformed
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpCabecera;
    private javax.swing.JPanel jpLateral;
    private javax.swing.JLabel labelFacebook;
    private javax.swing.JLabel labelGithub;
    private javax.swing.JLabel labelLinkedin;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelTwitter;
    private javax.swing.JLabel labelYoutube;
    // End of variables declaration//GEN-END:variables
}
