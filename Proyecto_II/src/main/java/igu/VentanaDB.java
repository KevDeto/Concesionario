package igu;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import logica.Automovil;
import logica.Controladora;

public class VentanaDB extends javax.swing.JFrame {

    private Controladora control = null;

    public VentanaDB() {
        initComponents();
        this.control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBD = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tableBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableBD.getTableHeader().setResizingAllowed(false);
        tableBD.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableBD);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        jLabel1.setText("BASE DE DATOS");

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setFocusPainted(false);
        btnEditar.setFocusable(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setFocusPainted(false);
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atras.png"))); // NOI18N
        btnAtras.setFocusPainted(false);
        btnAtras.setFocusable(false);
        btnAtras.setPreferredSize(new java.awt.Dimension(24, 24));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //genera las instrucciones que contenga siempre que se abra la ventana
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarDatosTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tableBD.getRowCount() > 0) {
            if (tableBD.getSelectedRow() != -1) {
                int opcion = JOptionPane.showConfirmDialog(this, "Estas seguro que quieres eliminarlo ?", "Eliminar", JOptionPane.OK_CANCEL_OPTION, 2);
                if (opcion == 0) {
                    int idAuto = Integer.parseInt(String.valueOf(tableBD.getValueAt(tableBD.getSelectedRow(), 0)));
                    control.eliminarAuto(idAuto);
                    JOptionPane.showMessageDialog(this, "Eliminado con exito", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un automovil", "ERROR", JOptionPane.ERROR_MESSAGE, null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "La tabla esta vacia", "ERROR", JOptionPane.ERROR_MESSAGE, null);
        }
        cargarDatosTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tableBD.getRowCount() > 0) {
            if (tableBD.getSelectedRow() != -1) {
                int opcion = JOptionPane.showConfirmDialog(this, "Estas seguro que quieres editarlo ?", "Editar", JOptionPane.OK_CANCEL_OPTION, 2);
                if (opcion == 0) {
                    int idAuto = Integer.parseInt(String.valueOf(tableBD.getValueAt(tableBD.getSelectedRow(), 0)));
                    VentanaRegistrar venReg = new VentanaRegistrar(idAuto);
                    venReg.setVisible(true);
                    venReg.setLocationRelativeTo(null);
                    venReg.setResizable(false);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un automovil", "ERROR", JOptionPane.ERROR_MESSAGE, null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "La tabla esta vacia", "ERROR", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VentanaMenu venMenu = new VentanaMenu();
        venMenu.setVisible(true);
        venMenu.setLocationRelativeTo(null);
        venMenu.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void cargarDatosTabla() {
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] titulos = {"id", "modelo", "marca", "color", "motor", "patente", "puertas"};
        tableModel.setColumnIdentifiers(titulos);

        List<Automovil> listaAutos = control.traerDatosAutomovil();

        if (listaAutos != null) {
            for (Automovil auto : listaAutos) {
                Object[] objetos = {auto.getId(), auto.getModelo(), auto.getMarca(), auto.getColor(), auto.getMotor(), auto.getPatente(), auto.getPuertas()};
                tableModel.addRow(objetos);
            }
        }
        tableBD.setModel(tableModel);
        editarAspectoTabla(titulos);
    }

    private void editarAspectoTabla(String[] titulos) {
        DefaultTableCellRenderer tableCell = new DefaultTableCellRenderer();
        for (int i = 0; i < titulos.length; i++) {
            tableCell.setHorizontalAlignment(SwingConstants.CENTER);
            tableBD.getColumnModel().getColumn(i).setCellRenderer(tableCell);
        }
        TableColumnModel tableColModel = tableBD.getColumnModel();
        tableColModel.getColumn(0).setPreferredWidth(0);
        tableColModel.getColumn(1).setPreferredWidth(160);
        tableColModel.getColumn(2).setPreferredWidth(120);
        tableColModel.getColumn(6).setPreferredWidth(50);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableBD;
    // End of variables declaration//GEN-END:variables
}
