package examenn002;


import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ListaProfesores lista = new ListaProfesores();
    public Principal() {
        initComponents(); 
       String lista=ListaProfesores.leer();
        this.txtRegistros.append(lista);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtced = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRegistros = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        CargarRegs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("REGISTROS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos profesor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Cedula");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 43, -1, -1));

        txtced.setText(" ");
        jPanel2.add(txtced, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 40, 151, -1));

        jLabel3.setText("Nombres");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 74, -1, -1));

        txtnom.setText(" ");
        jPanel2.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 71, 151, -1));

        jLabel4.setText("Apellidos");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 105, -1, -1));

        txtape.setText(" ");
        jPanel2.add(txtape, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 102, 151, -1));

        jLabel5.setText("horas Semanales");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 206, -1, -1));

        jLabel6.setText("Carrera");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 203, 151, -1));

        jComboBox1.setBackground(new java.awt.Color(153, 204, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ProfesorDeTiempoParcial", "ProfesorDeMedioTiempo", "ProfesorDeTiempoCompleto" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel7.setText("Tipo de horario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 136, -1, -1));

        jLabel8.setText("Horas Clase");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 174, -1, -1));

        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        jSpinner2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jSpinner2FocusGained(evt);
            }
        });
        jPanel2.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 171, 151, -1));

        jComboBox2.setBackground(new java.awt.Color(153, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ProfesorDeTiempoParcial", "ProfesorDeMedioTiempo", "ProfesorDeTiempoCompleto" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox2MousePressed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 133, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 400, 280));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jButton2.setText("Salir");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        txtRegistros.setColumns(20);
        txtRegistros.setRows(5);
        jScrollPane1.setViewportView(txtRegistros);

        jLabel9.setText("Registros");

        CargarRegs.setText("Cargar Registros");
        CargarRegs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarRegsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CargarRegs)
                                .addGap(55, 55, 55))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CargarRegs)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
     int horasClase1;
     int horasSemanales1;
    public void ProfesorTiempoParcial() {
        String cedula = txtced.getText();
        String nombres = txtnom.getText();
        String apellidos = txtape.getText();
        
        ProfesorTiempoParcial ptp = new ProfesorTiempoParcial(horasClase1, cedula, nombres, apellidos, horasClase1, jComboBox1.getSelectedItem().toString());
        lista.agregar(ptp);
        JOptionPane.showMessageDialog(null,"Archivo guardado");
        lista.grabar();
    }

    public void ProfesoresMedioTiempo() {
        String cedula2 =  txtced.getText();
        String nombres2 = txtnom.getText();
        String apellidos2 = txtape.getText();
        ProfesoresMedioTiempo pmt = new ProfesoresMedioTiempo(cedula2, nombres2, apellidos2, horasClase1, jComboBox1.getSelectedItem().toString());
        lista.agregar(pmt);
        JOptionPane.showMessageDialog(null,"Archivo guardado");
        lista.grabar();
    }

    public void ProfesoresTiempoCompleto() {
       String cedula =  txtced.getText();
        String nombres = txtnom.getText();
        String apellidos = txtape.getText();
        
        ProfesoresTiempoCompleto ptc = new ProfesoresTiempoCompleto(cedula, nombres, apellidos, horasClase1, jComboBox1.getSelectedItem().toString());
        lista.agregar(ptc);
        JOptionPane.showMessageDialog(null,"Archivo guardado");
        lista.grabar();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedIndex()==0) {
            ProfesorTiempoParcial();
        }
        if (jComboBox1.getSelectedIndex()==1) {
            ProfesoresMedioTiempo();
        }
        if (jComboBox1.getSelectedIndex()==2) {
            ProfesoresTiempoCompleto();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // TODO add your handling code here:
        horasClase1=Integer.parseInt(jSpinner2.getValue().toString());
        if (horasClase1 < 2 || horasClase1 > 9) {
                JOptionPane.showMessageDialog(null, "Las horas clase esta fuera del rango permitido");
            }
            
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        horasSemanales1=Integer.parseInt(jSpinner1.getValue().toString());
        if (horasSemanales1 > 20) {
                JOptionPane.showMessageDialog(null, "Las horas de clase semanales esta fuera del limite");
            }
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSpinner2FocusGained
        // TODO add your handling code here: 
        
    }//GEN-LAST:event_jSpinner2FocusGained

    private void jComboBox2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox2MousePressed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        if (jComboBox2.getSelectedIndex()==1&&jComboBox2.getSelectedIndex()==2) {
             jSpinner1.setEnabled(false);
        }  
        
        if (jComboBox2.getSelectedIndex()==0) {
             jSpinner1.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void CargarRegsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarRegsActionPerformed
        String lista=ListaProfesores.leer();
        this.txtRegistros.append(lista);
    }//GEN-LAST:event_CargarRegsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarRegs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea txtRegistros;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtced;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
