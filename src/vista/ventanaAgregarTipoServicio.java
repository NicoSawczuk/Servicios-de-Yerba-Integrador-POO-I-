/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Prestador;
import Modelo.Servicio;
import Modelo.ServicioPrestador;
import Modelo.TipoServicio;
import Modelo.Unidad;
import controlador.Controlador;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nico2
 */
public class ventanaAgregarTipoServicio extends javax.swing.JFrame {
    private final Controlador c;
    private final JFrame vAnterior;
    /**
     * Creates new form ventanaTipoServicio
  
    public ventanaAgregarTipoServicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCosto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        comboUnidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTiposServicios = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPrestadores = new javax.swing.JList();
        comboPrestador = new javax.swing.JComboBox<>();
        botonAgregarTipoServicio = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label6 = new java.awt.Label();
        jLabel13 = new javax.swing.JLabel();
        botonAsignarPrestador = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtCosto.setBackground(new java.awt.Color(216, 249, 225));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(216, 249, 225));
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        comboUnidad.setBackground(new java.awt.Color(216, 249, 225));
        comboUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        listaTiposServicios.setBackground(new java.awt.Color(216, 249, 225));
        listaTiposServicios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listaTiposServicios.setForeground(new java.awt.Color(52, 97, 78));
        listaTiposServicios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTiposServiciosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaTiposServicios);

        listaPrestadores.setBackground(new java.awt.Color(216, 249, 225));
        listaPrestadores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listaPrestadores.setForeground(new java.awt.Color(52, 97, 78));
        listaPrestadores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPrestadoresValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaPrestadores);

        comboPrestador.setBackground(new java.awt.Color(216, 249, 225));

        botonAgregarTipoServicio.setBackground(new java.awt.Color(110, 204, 190));
        botonAgregarTipoServicio.setForeground(new java.awt.Color(52, 97, 78));
        botonAgregarTipoServicio.setText("Agregar");
        botonAgregarTipoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTipoServicioActionPerformed(evt);
            }
        });

        botonNuevo.setBackground(new java.awt.Color(110, 204, 190));
        botonNuevo.setForeground(new java.awt.Color(52, 97, 78));
        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripción");

        jLabel8.setText("Tipos de servicios");

        jLabel9.setText("Prestadores");

        jLabel10.setText("Costo");

        jLabel11.setText("Prestador");

        jLabel12.setText("Unidad");

        label6.setBackground(new java.awt.Color(245, 245, 245));
        label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label6.setText("Agregar un nuevo tipo de servicio");

        jLabel13.setText("Asignar un prestador");

        botonAsignarPrestador.setBackground(new java.awt.Color(110, 204, 190));
        botonAsignarPrestador.setForeground(new java.awt.Color(52, 97, 78));
        botonAsignarPrestador.setText("Asignar");
        botonAsignarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsignarPrestadorActionPerformed(evt);
            }
        });

        jLabel14.setText("Cargar servicio");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-tijeras-64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboPrestador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(botonNuevo)
                                        .addGap(26, 26, 26)
                                        .addComponent(botonAgregarTipoServicio))
                                    .addComponent(botonAsignarPrestador, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboUnidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregarTipoServicio)
                            .addComponent(botonNuevo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(comboPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonAsignarPrestador)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void limpiar(){
        this.txtCosto.setText("");
        this.txtDescripcion.setText("");
        
        //creamos una nueva lista de servicios vacia
        DefaultListModel modelolista = new DefaultListModel();
        this.listaTiposServicios.setModel(modelolista);
        
        //cargamos el combo unidad
        DefaultComboBoxModel combo = new DefaultComboBoxModel(this.c.listarUnidades().toArray());
        this.comboUnidad.setModel(combo);
        //desseleccionamos el combo unidad
        this.comboUnidad.setSelectedIndex(-1);
        
        //desseleccionamos el combo prestadores
        this.comboPrestador.setEnabled(false);

         //llenamos la lista de tipos de servicios
        this.listaTiposServicios.setListData(this.c.listarTiposServicios().toArray());
        //desseleccionamos la lista de tipos de servicios
        this.listaTiposServicios.clearSelection();
        
        //limpiamos la lista de prestadores
        this.listaPrestadores.setModel(modelolista);
        
    }
    
    public ventanaAgregarTipoServicio(Controlador c, JFrame vAnterior) {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(245,245,245));
        this.c=c;
        this.vAnterior=vAnterior;
        limpiar();
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.vAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void listaTiposServiciosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTiposServiciosValueChanged
        if(!this.listaTiposServicios.isSelectionEmpty()){
            DefaultComboBoxModel comboP = new DefaultComboBoxModel(this.c.listarPrestadores().toArray());

            TipoServicio ts = (TipoServicio) this.listaTiposServicios.getSelectedValue();
            this.txtDescripcion.setText(ts.getDescripcion());
            this.comboUnidad.setSelectedItem(ts.getUnidad());
            this.comboPrestador.setEnabled(true);
            this.comboPrestador.setModel(comboP);
            this.listaPrestadores.setListData((Vector) ts.getServiciosPrestador());
            
        }
        else{
            this.txtDescripcion.setEnabled(true);
            this.txtCosto.setEnabled(true);
            this.botonAgregarTipoServicio.setEnabled(true);
        }       
    }//GEN-LAST:event_listaTiposServiciosValueChanged

    private void listaPrestadoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPrestadoresValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPrestadoresValueChanged

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        char car = evt.getKeyChar();
        if (Character.isDigit(car)){
            
        }
        else{
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "No se permiten letras");
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isSpaceChar(car)){
            
        }
        else{
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "No se permiten números");
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        //limpiar todo
        limpiar();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonAgregarTipoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarTipoServicioActionPerformed
        if(this.txtDescripcion.getText().isEmpty()!=true){
            Unidad u = (Unidad) comboUnidad.getSelectedItem();
            if (!this.listaTiposServicios.isSelectionEmpty() && this.txtDescripcion.getText().isEmpty()!=true) {
                TipoServicio s = (TipoServicio) this.listaTiposServicios.getSelectedValue();
                this.c.editarTipoServicio(s, txtDescripcion.getText(), u);
            }
            else{
                this.c.agregarTipoServicio(txtDescripcion.getText(), u);
            }
            limpiar();
            this.botonAgregarTipoServicio.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        }
    }//GEN-LAST:event_botonAgregarTipoServicioActionPerformed

    private void botonAsignarPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsignarPrestadorActionPerformed
        if(this.txtCosto.getText().isEmpty()!=true){
        String costo2 = txtCosto.getText();
        double costo = Double.parseDouble(costo2);
        if (!this.listaTiposServicios.isSelectionEmpty() && this.comboPrestador.getSelectedItem() != null){
            Prestador p = (Prestador) this.comboPrestador.getSelectedItem();
            TipoServicio ts = (TipoServicio) this.listaTiposServicios.getSelectedValue();
            this.c.agregarServicioPrestador(costo, ts, p);
            this.listaPrestadores.setListData(ts.getServiciosPrestador().toArray());
         }
        }
        else {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        }
    }//GEN-LAST:event_botonAsignarPrestadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarTipoServicio;
    private javax.swing.JButton botonAsignarPrestador;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JComboBox<String> comboPrestador;
    private javax.swing.JComboBox<String> comboUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label6;
    private javax.swing.JList listaPrestadores;
    private javax.swing.JList listaTiposServicios;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
