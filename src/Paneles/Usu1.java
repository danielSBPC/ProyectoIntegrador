
package Paneles;

import Frames.Principal;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Ejercicio;

/**
 *
 * @author Daniel
 */
public class Usu1 extends javax.swing.JPanel {
    
    private JTable tabla;
    private DefaultTableModel model;
    
    public Usu1() {
        initComponents();
        tabla = new JTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 890, 410));
    }// </editor-fold>//GEN-END:initComponents
                                         

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
        model.addColumn("Descripcion");

        tabla.setModel(model);
        
        tabla.getColumn("Nombre").setPreferredWidth(120);
        tabla.getColumn("Descripcion").setPreferredWidth(790);

        model.setRowCount(0);

        Object[] fila = new Object[2];

        for (Ejercicio ejercicio : tablaEjercicios) {

            fila[0] = ejercicio.getNombre();
            fila[1] = ejercicio.getDescripcion();

            model.addRow(fila);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane contenedor;
    // End of variables declaration//GEN-END:variables
}
