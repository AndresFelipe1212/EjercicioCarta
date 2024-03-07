
package juegocartas;

import javax.swing.JOptionPane;

public class FrmJuego extends javax.swing.JFrame {
    
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    public FrmJuego() {
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRepartir = new javax.swing.JButton();
        btnVerificarGrupo = new javax.swing.JButton();
        btnObtenerEscalera = new javax.swing.JButton();
        btnObtenerPuntaje = new javax.swing.JButton();
        tpJugadores = new javax.swing.JTabbedPane();
        pnlJugador1 = new javax.swing.JPanel();
        pnlJugador2 = new javax.swing.JPanel();
        btnOrganizar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(128, 128, 0));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("JUEGO DE CARTAS");

        btnRepartir.setBackground(new java.awt.Color(0, 255, 0));
        btnRepartir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRepartir.setForeground(new java.awt.Color(0, 0, 0));
        btnRepartir.setText("Repartir Cartas");
        btnRepartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepartirActionPerformed(evt);
            }
        });

        btnVerificarGrupo.setBackground(new java.awt.Color(0, 255, 0));
        btnVerificarGrupo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnVerificarGrupo.setForeground(new java.awt.Color(0, 0, 0));
        btnVerificarGrupo.setText("Verificar Grupo");
        btnVerificarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarGrupoActionPerformed(evt);
            }
        });

        btnObtenerEscalera.setBackground(new java.awt.Color(0, 255, 0));
        btnObtenerEscalera.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnObtenerEscalera.setForeground(new java.awt.Color(0, 0, 0));
        btnObtenerEscalera.setText("Obtener escalera");
        btnObtenerEscalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerEscaleraActionPerformed(evt);
            }
        });

        btnObtenerPuntaje.setBackground(new java.awt.Color(0, 255, 0));
        btnObtenerPuntaje.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnObtenerPuntaje.setForeground(new java.awt.Color(0, 0, 0));
        btnObtenerPuntaje.setText("Obtener puntaje");
        btnObtenerPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerPuntajeActionPerformed(evt);
            }
        });

        pnlJugador1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout pnlJugador1Layout = new javax.swing.GroupLayout(pnlJugador1);
        pnlJugador1.setLayout(pnlJugador1Layout);
        pnlJugador1Layout.setHorizontalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        pnlJugador1Layout.setVerticalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Martín Estrada Contreras", pnlJugador1);

        pnlJugador2.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout pnlJugador2Layout = new javax.swing.GroupLayout(pnlJugador2);
        pnlJugador2.setLayout(pnlJugador2Layout);
        pnlJugador2Layout.setHorizontalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        pnlJugador2Layout.setVerticalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Raúl Vidal", pnlJugador2);

        btnOrganizar.setBackground(new java.awt.Color(0, 255, 0));
        btnOrganizar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnOrganizar.setForeground(new java.awt.Color(0, 0, 0));
        btnOrganizar.setText("Organizar");
        btnOrganizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpJugadores)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRepartir)
                        .addGap(18, 18, 18)
                        .addComponent(btnObtenerEscalera)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrganizar)
                        .addGap(19, 19, 19)
                        .addComponent(btnObtenerPuntaje)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificarGrupo))
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepartir)
                    .addComponent(btnObtenerEscalera)
                    .addComponent(btnObtenerPuntaje)
                    .addComponent(btnVerificarGrupo)
                    .addComponent(btnOrganizar))
                .addGap(18, 18, 18)
                .addComponent(tpJugadores))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepartirActionPerformed
     jugador1.repartir();
     jugador2.repartir();
     
     jugador1.mostrar(pnlJugador1);
     jugador2.mostrar(pnlJugador2);
    }//GEN-LAST:event_btnRepartirActionPerformed

    private void btnVerificarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarGrupoActionPerformed
        int pestaña = tpJugadores.getSelectedIndex();
        String mensaje = "";
        switch(pestaña){
            case 0:
                mensaje = jugador1.getGrupos();
                break;
            case 1:
                mensaje = jugador2.getGrupos();
                break;
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_btnVerificarGrupoActionPerformed

    private void btnObtenerEscaleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerEscaleraActionPerformed

        int pestaña = tpJugadores.getSelectedIndex();
        switch (pestaña) {
            case 0:
                jugador1.escalera();
                break;
            case 1:
                jugador2.escalera();
                break;
        }


    }//GEN-LAST:event_btnObtenerEscaleraActionPerformed

    private void btnObtenerPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerPuntajeActionPerformed
        int pestaña = tpJugadores.getSelectedIndex();
        switch(pestaña){
            case 0:
                JOptionPane.showMessageDialog(null,"La suma es: "+ jugador1.getPuntaje());
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"La suma es: "+ jugador2.getPuntaje());
                break;
        }     
    }//GEN-LAST:event_btnObtenerPuntajeActionPerformed

    private void btnOrganizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizarActionPerformed
        int pestaña = tpJugadores.getSelectedIndex();
        switch(pestaña){
            case 0:
                jugador1.organizar();
                jugador1.mostrar(pnlJugador1);   
                break;
            case 1:
                jugador2.organizar();
                jugador2.mostrar(pnlJugador2);
                break;
        }
    }//GEN-LAST:event_btnOrganizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObtenerEscalera;
    private javax.swing.JButton btnObtenerPuntaje;
    private javax.swing.JButton btnOrganizar;
    private javax.swing.JButton btnRepartir;
    private javax.swing.JButton btnVerificarGrupo;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel pnlJugador1;
    private javax.swing.JPanel pnlJugador2;
    private javax.swing.JTabbedPane tpJugadores;
    // End of variables declaration//GEN-END:variables
}
