/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Prestador;
import Modelo.Zona;
import controlador.Controlador;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nico2
 */
public class ventanaAgregarPrestador extends javax.swing.JFrame {
    private final Controlador c;
    private final JFrame vAnterior;
    
    

    /**
     * Creates new form ventanaAgregarPrestador
     */
    public ventanaAgregarPrestador(Controlador c, JFrame vAnterior) {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(245,245,245));
        this.c=c;
        this.vAnterior=vAnterior;
        limpiar();
    }
    
    public void limpiar(){
        this.txtNombre.setText("");
        this.txtCUIT.setText("");
        this.txtDomicilio.setText("");
        this.txtNroInscrip.setText("");
        this.txtRazonSocial.setText("");
        
        
        //creamos una nueva lista de prestadores vacia
        DefaultListModel modelolista = new DefaultListModel();
        this.listaPrestador.setModel(modelolista);
        
         //llenamos la lista de prestadores 
        this.listaPrestador.setListData(this.c.listarPrestadores().toArray());
        //desseleccionamos la lista de prestadores
        this.listaPrestador.clearSelection();
        
        DefaultComboBoxModel comboZonas2 = new DefaultComboBoxModel(this.c.listarZonas().toArray());
        this.comboZonas.setModel(comboZonas2);
        
        //desseleccionamos la lista de prestadores
        this.listaZonas.clearSelection();
        
        //limpiamos la lista de zonas
        this.listaZonas.setModel(modelolista);
        //desseleccionamos el combo de zonas
        this.comboZonas.setSelectedIndex(-1);
        //ocultamos el combo de zonas
        this.comboZonas.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        label6 = new java.awt.Label();
        txtCUIT = new javax.swing.JTextField();
        txtNroInscrip = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        comboZonas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaZonas = new javax.swing.JList();
        txtNombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPrestador = new javax.swing.JList();
        botonAgregarZona = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel10.setText("Asignar una zona al prestador");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        label6.setBackground(new java.awt.Color(245, 245, 245));
        label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label6.setText("Agregar un nuevo prestador al sistema");

        txtCUIT.setBackground(new java.awt.Color(216, 249, 225));
        txtCUIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCUITKeyTyped(evt);
            }
        });

        txtNroInscrip.setBackground(new java.awt.Color(216, 249, 225));
        txtNroInscrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroInscripKeyTyped(evt);
            }
        });

        txtDomicilio.setBackground(new java.awt.Color(216, 249, 225));
        txtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });

        txtRazonSocial.setBackground(new java.awt.Color(216, 249, 225));
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyTyped(evt);
            }
        });

        comboZonas.setBackground(new java.awt.Color(216, 249, 225));
        comboZonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboZonasActionPerformed(evt);
            }
        });

        listaZonas.setBackground(new java.awt.Color(216, 249, 225));
        listaZonas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listaZonas.setForeground(new java.awt.Color(52, 97, 78));
        jScrollPane2.setViewportView(listaZonas);

        txtNombre.setBackground(new java.awt.Color(216, 249, 225));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        listaPrestador.setBackground(new java.awt.Color(216, 249, 225));
        listaPrestador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listaPrestador.setForeground(new java.awt.Color(52, 97, 78));
        listaPrestador.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPrestadorValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaPrestador);

        botonAgregarZona.setBackground(new java.awt.Color(110, 204, 190));
        botonAgregarZona.setForeground(new java.awt.Color(52, 97, 78));
        botonAgregarZona.setText("Agregar");
        botonAgregarZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarZonaActionPerformed(evt);
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

        botonGuardar.setBackground(new java.awt.Color(110, 204, 190));
        botonGuardar.setForeground(new java.awt.Color(52, 97, 78));
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Razón Social");

        jLabel7.setText("Nro inscripción al INYM");

        jLabel8.setText("Domicilio legal");

        jLabel3.setText("Nombre");

        jLabel4.setText("CUIT");

        jLabel5.setText("Agregar un prestador");

        jLabel1.setText("Zonas en las que trabaja");

        jLabel2.setText("Prestadores");

        jLabel9.setText("Asignar una zona al prestador");

        jLabel11.setText("Zonas");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-agregar-administrador-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(botonGuardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNroInscrip, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAgregarZona)
                            .addComponent(comboZonas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroInscrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonNuevo)
                            .addComponent(botonGuardar)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonAgregarZona))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.vAnterior.setVisible(true);
        this.dispose();
        this.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_formWindowClosing

    private void listaPrestadorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPrestadorValueChanged
        if(!this.listaPrestador.isSelectionEmpty()){
            Prestador p = (Prestador) this.listaPrestador.getSelectedValue();
            this.txtCUIT.setText(p.getCuit());
            this.txtDomicilio.setText(p.getDomicilioLegal());
            this.txtNombre.setText(p.getNombre());
            this.txtNroInscrip.setText(p.getNumeroInym());
            this.txtRazonSocial.setText(p.getRazonSocial());
            this.comboZonas.setEnabled(true);
            this.txtNroInscrip.setEnabled(false);
            this.txtCUIT.setEnabled(false);
            this.listaZonas.setListData(p.getZonas().toArray());
        }
        else{
            this.txtCUIT.setEnabled(true);
            this.txtDomicilio.setEnabled(true);
            this.txtNombre.setEnabled(true);
            this.txtNroInscrip.setEnabled(true);
            this.txtRazonSocial.setEnabled(true);
            this.comboZonas.setEnabled(true);
            this.botonAgregarZona.setEnabled(true);
            this.botonGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_listaPrestadorValueChanged

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isSpaceChar(car)){
            
        }
        else{
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "No se permiten números");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCUITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCUITKeyTyped
        char car = evt.getKeyChar();
        if (Character.isDigit(car)){
            
        }
        else{
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "No se permiten letras");
        }
    }//GEN-LAST:event_txtCUITKeyTyped

    private void txtNroInscripKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroInscripKeyTyped
        char car = evt.getKeyChar();
        if (Character.isDigit(car)){
            
        }
        else{
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "No se permiten letras");
        }
    }//GEN-LAST:event_txtNroInscripKeyTyped

    private void txtRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isSpaceChar(car)){
            
        }
        else{
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "No se permiten números");
        }
    }//GEN-LAST:event_txtRazonSocialKeyTyped

    private void txtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDomicilioKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isSpaceChar(car)){
            
        }
        else{
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "No se permiten números");
        }
    }//GEN-LAST:event_txtDomicilioKeyTyped

    private void comboZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboZonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboZonasActionPerformed

    private void botonAgregarZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarZonaActionPerformed
        if (this.listaPrestador.getSelectedValue() != null && this.comboZonas.getSelectedItem() != null){
            Zona z = (Zona) this.comboZonas.getSelectedItem();
            Prestador p = (Prestador) this.listaPrestador.getSelectedValue();
            this.c.agregarZonaPrestador(p, z);
            this.listaZonas.setListData(p.getZonas().toArray());
        }
    }//GEN-LAST:event_botonAgregarZonaActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        //limpiar todo
        limpiar();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if(this.txtCUIT.getText().isEmpty()!=true && this.txtNombre.getText().isEmpty()!=true && this.txtRazonSocial.getText().isEmpty()!=true && this.txtNroInscrip.getText().isEmpty()!=true && this.txtDomicilio.getText().isEmpty()!=true){
            if (!this.listaPrestador.isSelectionEmpty()) {
            Prestador p = (Prestador) this.listaPrestador.getSelectedValue();
            this.c.editarPrestador(p, txtNombre.getText(), txtCUIT.getText(), txtRazonSocial.getText(), txtNroInscrip.getText(), txtDomicilio.getText());
        }
        else{
            this.c.agregarPrestador(txtNombre.getText(), txtCUIT.getText(), txtRazonSocial.getText(), txtNroInscrip.getText(), txtDomicilio.getText());
        }
        limpiar();
        this.botonGuardar.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarZona;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JComboBox<String> comboZonas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label6;
    private javax.swing.JList listaPrestador;
    private javax.swing.JList listaZonas;
    private javax.swing.JTextField txtCUIT;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroInscrip;
    private javax.swing.JTextField txtRazonSocial;
    // End of variables declaration//GEN-END:variables
}
