
package Paneles;

import Frames.Principal;
import accesoBBDD.GimnasioPersistencia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Ejercicio;

public class Admin1 extends javax.swing.JPanel {

    private final JTable tabla;
    private DefaultTableModel model;
    private final GimnasioPersistencia gimPersi;
    private Principal principal;

    public Admin1() {
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
        Ejercicio e = obtenerEjercicioTabla();
        
        if (e != null) {

            int x = gimPersi.borrarEjercicio(e.getNombre());

            if (x == 1) {
                JOptionPane.showMessageDialog(principal, "Ejercicio eliminado correctamente", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                
                ArrayList<Ejercicio> listaEjercicio = gimPersi.consultaEjercicio();
                cargarTablaEjercicio(listaEjercicio);
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    public void cargarTablaEjercicio(ArrayList<Ejercicio> tablaEjercicios) {

        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        contenedor.setViewportView(tabla);

        model = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Nombre");
        model.addColumn("Descripción");

        tabla.setModel(model);

        tabla.getColumn("Nombre").setPreferredWidth(120);
        tabla.getColumn("Descripción").setPreferredWidth(790);

        model.setRowCount(0);

        Object[] fila = new Object[2];

        for (Ejercicio ejercicio : tablaEjercicios) {

            fila[0] = ejercicio.getNombre();
            fila[1] = ejercicio.getDescripcion();

            model.addRow(fila);
        }
    }

    public Ejercicio obtenerEjercicioTabla() {
        Ejercicio e = null;
        int fila = tabla.getSelectedRow();

        if (fila > -1) {
            String nom = (String) tabla.getValueAt(fila, 0);
            String desc = (String) tabla.getValueAt(fila, 1);

            e = new Ejercicio(0, null, desc, nom, null);

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro en la tabla especifica", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return e;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JScrollPane contenedor;
    // End of variables declaration//GEN-END:variables

}
