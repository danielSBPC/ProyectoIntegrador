
package Paneles;

import Frames.Principal;
import accesoBBDD.GimnasioPersistencia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class Admin2 extends javax.swing.JPanel {

    private final JTable tabla;
    private DefaultTableModel modelo;
    private final GimnasioPersistencia gimPersi;
    private Principal principal;

    
    public Admin2() {
        initComponents();
        tabla = new JTable();
        gimPersi = new GimnasioPersistencia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JScrollPane();
        botonEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 890, 410));

        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(0, 51, 153));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoEli.png"))); // NOI18N
        botonEliminar.setText("Eliminar ");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 150, 55));
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        Usuario u = obtenerUsuarioTabla();

        if (u != null) {

            int x = gimPersi.borrarUsuario(u.getId_u());

            if (x == 1) {
                JOptionPane.showMessageDialog(principal, "Ejercicio eliminado correctamente", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                ArrayList<Usuario> listaUsuario = gimPersi.consultaUsuario();
                cargarTablaUsuario(listaUsuario);
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    public void cargarTablaUsuario(ArrayList<Usuario> tablaUsuarios) {
        
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        contenedor.setViewportView(tabla);

        modelo = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Altura");
        modelo.addColumn("Peso");

        tabla.setModel(modelo);

        tabla.getColumn("Id").setPreferredWidth(25);
        tabla.getColumn("Nombre").setPreferredWidth(55);
        tabla.getColumn("Apellidos").setPreferredWidth(80);
        tabla.getColumn("Altura").setPreferredWidth(25);
        tabla.getColumn("Peso").setPreferredWidth(20);

        modelo.setRowCount(0);

        Object[] fila = new Object[5];
       
        for (Usuario usuario : tablaUsuarios) {

            fila[0] = usuario.getId_u();
            fila[1] = usuario.getNombre();
            fila[2] = usuario.getApellido();
            fila[3] = usuario.getAltura();
            fila[4] = usuario.getPeso();

            modelo.addRow(fila);
        }  
    }

    public Usuario obtenerUsuarioTabla() {
        Usuario u = null;

        int fila = tabla.getSelectedRow();

        if (fila > -1) {
            int id = (int) tabla.getValueAt(fila, 0);
            String nom = (String) tabla.getValueAt(fila, 1);
            String ape = (String) tabla.getValueAt(fila, 2);
            double alt = (double) tabla.getValueAt(fila, 3);
            double peso = (double) tabla.getValueAt(fila, 4);

            u = new Usuario(id, nom, ape, alt, peso, "");

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro en la tabla espec�fica", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return u;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JScrollPane contenedor;
    // End of variables declaration//GEN-END:variables
}
