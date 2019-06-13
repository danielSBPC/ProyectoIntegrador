
package Paneles;

import accesoBBDD.GimnasioPersistencia;
import javax.swing.JOptionPane;
import model.Ejercicio;
import model.Usuario;

public class Admin3 extends javax.swing.JPanel {
    
    private GimnasioPersistencia gimPersi;
    
    public Admin3() {
        initComponents();
        gimPersi = new GimnasioPersistencia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUsu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        botonaniadir1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        panelEje = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreEj = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMonitor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cmbBox = new javax.swing.JComboBox<>();
        botonGuardarEjer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUsu.setBackground(new java.awt.Color(204, 255, 255));
        panelUsu.setForeground(new java.awt.Color(204, 204, 204));
        panelUsu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Nombre:");
        panelUsu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Apellidos:");
        panelUsu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Altura:");
        panelUsu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Peso:");
        panelUsu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("Contraseña:");
        panelUsu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 40));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelUsu.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 240, 40));

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(153, 153, 153));
        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelUsu.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 80, 40));

        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAltura.setForeground(new java.awt.Color(153, 153, 153));
        txtAltura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelUsu.add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 80, 40));

        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(153, 153, 153));
        txtApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelUsu.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoUsu.png"))); // NOI18N
        panelUsu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 110, 130));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelUsu.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 240, 40));

        botonaniadir1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonaniadir1.setForeground(new java.awt.Color(0, 51, 153));
        botonaniadir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoGuar.png"))); // NOI18N
        botonaniadir1.setText("Guardar");
        botonaniadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonaniadir1ActionPerformed(evt);
            }
        });
        panelUsu.add(botonaniadir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 425, 150, 60));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        panelUsu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 340, 10));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Alta Usuario");
        panelUsu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 30));

        add(panelUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 520));

        panelEje.setBackground(new java.awt.Color(204, 255, 255));
        panelEje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoPeso.png"))); // NOI18N
        panelEje.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 110, 130));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("Tipo:");
        panelEje.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("Nombre:");
        panelEje.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 40));

        txtNombreEj.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreEj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombreEj.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreEj.setText("ewr");
        txtNombreEj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelEje.add(txtNombreEj, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, 40));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("Descripción:");
        panelEje.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 120, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText("Monitor:");
        panelEje.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 40));

        txtMonitor.setBackground(new java.awt.Color(255, 255, 255));
        txtMonitor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMonitor.setForeground(new java.awt.Color(153, 153, 153));
        txtMonitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelEje.add(txtMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 110, 40));

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        panelEje.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 250, 190));

        cmbBox.setBackground(new java.awt.Color(255, 255, 255));
        cmbBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbBox.setForeground(new java.awt.Color(153, 153, 153));
        cmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Musculación", "Cardio" }));
        panelEje.add(cmbBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 170, 40));

        botonGuardarEjer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonGuardarEjer.setForeground(new java.awt.Color(0, 51, 153));
        botonGuardarEjer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoGuar.png"))); // NOI18N
        botonGuardarEjer.setText("Guardar");
        botonGuardarEjer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarEjerActionPerformed(evt);
            }
        });
        panelEje.add(botonGuardarEjer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 385, 150, 60));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Alta Ejercicio");
        panelEje.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, 30));

        add(panelEje, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 450, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarEjerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarEjerActionPerformed
         Ejercicio e = null;
         
         try {
             String tipo = cmbBox.getSelectedItem().toString();
             String nom = txtNombreEj.getText();
             String desc = txtDescripcion.getText();
             String moni = txtMonitor.getText();
             
             if (tipo.isEmpty() || nom.isEmpty() || desc.isEmpty() || moni.isEmpty()) {
                 JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
             
             } else {
                 e = new Ejercicio(0, tipo, desc, nom, moni);
                 
                 JOptionPane.showMessageDialog(this, "Ejercicio añadido correctamente", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                 gimPersi.addEjercicio(e);
             }
             
         } catch (Exception ev) {
             ev.printStackTrace();
         } 
         
         
    }//GEN-LAST:event_botonGuardarEjerActionPerformed

    private void botonaniadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonaniadir1ActionPerformed
        Usuario u = null;
        
        try {
            String nom = txtNombre.getText();
            String ape = txtApellidos.getText();
            String pass = new String(txtPass.getPassword());
            
            if (nom.isEmpty() || ape.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
            
            } else {
                double alt = Double.parseDouble(txtAltura.getText());
                double pes = Double.parseDouble(txtPeso.getText());
                
                u = new Usuario(0, nom, ape, alt, pes, pass);
                
                JOptionPane.showMessageDialog(this, "Usuario añadido correctamente", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                gimPersi.aniadirUsuario(u);
            }
           
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El valor de los campos altura y peso debe ser numérico"
                    , "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_botonaniadir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarEjer;
    private javax.swing.JButton botonaniadir1;
    private javax.swing.JComboBox<String> cmbBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelEje;
    private javax.swing.JPanel panelUsu;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtMonitor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEj;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
