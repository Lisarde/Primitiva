/*
 * Copyright (C) 2014 Los tios de DAM
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package primitivadam1;

import excepciones.PrimitivaException;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTextField;
import objetos.loteria.AdLoteria;
import objetos.loteria.Boleto;
import objetos.loteria.Boletos;
import objetos.loteria.Ganadora;
import utilidades.Ventanas;

/**
 *
 * @author alumno
 */
public class Sorteo extends javax.swing.JFrame {
    
    private ArrayList<AdLoteria> administraciones;
    
    private Ganadora ganadora;
    
    private Boletos boletos;

    /**
     * Creates new form Sacaperras
     */
    public Sorteo() {
        initComponents();
        administraciones = new ArrayList<>();
        crearAdminLoterias(10);
        crearBoletos();
    }
    
    private void crearAdminLoterias(int admins) { 
        for (int i = 1; i <= admins; i++) {
            boolean add = administraciones.add(new AdLoteria(i));
        }  
    }
    
    private void crearBoletos() {
        boletos = new Boletos();
        boletos.setAdministraciones(administraciones);
        boletos.generar();
    }
    
    private void habilitarBotones() {
        for (Component component  : PBotones.getComponents()) {
            component.setEnabled(true);
        }
    }
    
    private void filtrarBoletos(String filtro){
        
        switch (filtro) {
            case "primero":
                TAPremios.setText("Boleto 1er Premio\n");
                for (Boleto boleto : boletos.boletosByAciertos(ganadora, 6)) {
                    TAPremios.append(String.format("%s\n", boleto.toString()));
                }
                break;
            case "segundo":
                TAPremios.setText("Boletos 2º Premio\n");
                for (Boleto boleto : boletos.boletosByAciertos(ganadora, 5)) {
                    TAPremios.append(String.format("%s\n", boleto.toString()));
                }
                break;
                
            case "tercero":
                TAPremios.setText("Boletos 3º Premio\n");
                for (Boleto boleto : boletos.boletosByAciertos(ganadora, 4)) {
                    TAPremios.append(String.format("%s\n", boleto.toString()));
                }
                break;
                
            case "cuarto":
                TAPremios.setText("Boletos 4º Premio\n");
                for (Boleto boleto : boletos.boletosByAciertos(ganadora, 3)) {
                    TAPremios.append(String.format("%s\n", boleto.toString()));
                }
                break;
                
            case "reintegro":
                TAPremios.setText("Boletos Reintegro\n");
                for (Boleto boleto : boletos.boletosByAciertos(ganadora, 8)) {
                    TAPremios.append(String.format("%s\n", boleto.toString()));
                }
                break;
                
            case "complementario":
                TAPremios.setText("Boletos Complementario\n");
                for (Boleto boleto : boletos.boletosByAciertos(ganadora, 7)) {
                    TAPremios.append(String.format("%s\n", boleto.toString()));
                }
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PGanadora = new javax.swing.JPanel();
        TFGanadora1 = new javax.swing.JTextField();
        TFGanadora2 = new javax.swing.JTextField();
        TFGanadora3 = new javax.swing.JTextField();
        TFGanadora4 = new javax.swing.JTextField();
        TFGanadora5 = new javax.swing.JTextField();
        TFGanadora6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TFComplementario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFReintegro = new javax.swing.JTextField();
        BGenerar = new javax.swing.JButton();
        PBotones = new javax.swing.JPanel();
        BPrimero = new javax.swing.JButton();
        BSegundo = new javax.swing.JButton();
        BTercero = new javax.swing.JButton();
        BCuarto = new javax.swing.JButton();
        BReintegro = new javax.swing.JButton();
        BComplementario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAPremios = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PGanadora.setBorder(javax.swing.BorderFactory.createTitledBorder("Combinacion Ganadora"));

        TFGanadora1.setEditable(false);
        TFGanadora1.setColumns(2);

        TFGanadora2.setEditable(false);
        TFGanadora2.setColumns(2);

        TFGanadora3.setEditable(false);
        TFGanadora3.setColumns(2);

        TFGanadora4.setEditable(false);
        TFGanadora4.setColumns(2);

        TFGanadora5.setEditable(false);
        TFGanadora5.setColumns(2);

        TFGanadora6.setEditable(false);
        TFGanadora6.setColumns(2);

        jLabel1.setText("Complementario:");

        TFComplementario.setEditable(false);
        TFComplementario.setColumns(2);

        jLabel2.setText("Reintegro");

        TFReintegro.setEditable(false);
        TFReintegro.setColumns(2);

        BGenerar.setText("Generar");
        BGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PGanadoraLayout = new javax.swing.GroupLayout(PGanadora);
        PGanadora.setLayout(PGanadoraLayout);
        PGanadoraLayout.setHorizontalGroup(
            PGanadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PGanadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TFGanadora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TFGanadora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TFGanadora3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TFGanadora4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TFGanadora5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TFGanadora6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFComplementario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFReintegro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BGenerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PGanadoraLayout.setVerticalGroup(
            PGanadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PGanadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PGanadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFGanadora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFGanadora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFGanadora3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFGanadora4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFGanadora5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFGanadora6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(TFComplementario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TFReintegro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BGenerar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Premios"));
        PBotones.setToolTipText("");

        BPrimero.setText("1er Premio");
        BPrimero.setActionCommand("primero");
        BPrimero.setEnabled(false);
        BPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPrimeroActionPerformed(evt);
            }
        });

        BSegundo.setText("2º Premio");
        BSegundo.setActionCommand("segundo");
        BSegundo.setEnabled(false);
        BSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSegundoActionPerformed(evt);
            }
        });

        BTercero.setText("3er Premio");
        BTercero.setActionCommand("tercero");
        BTercero.setEnabled(false);
        BTercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTerceroActionPerformed(evt);
            }
        });

        BCuarto.setText("4º Premio");
        BCuarto.setActionCommand("cuarto");
        BCuarto.setEnabled(false);
        BCuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCuartoActionPerformed(evt);
            }
        });

        BReintegro.setText("Reintegro");
        BReintegro.setActionCommand("reintegro");
        BReintegro.setEnabled(false);
        BReintegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReintegroActionPerformed(evt);
            }
        });

        BComplementario.setText("Complementario");
        BComplementario.setActionCommand("complementario");
        BComplementario.setEnabled(false);
        BComplementario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BComplementarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBotonesLayout = new javax.swing.GroupLayout(PBotones);
        PBotones.setLayout(PBotonesLayout);
        PBotonesLayout.setHorizontalGroup(
            PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesLayout.createSequentialGroup()
                .addComponent(BPrimero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSegundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTercero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCuarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BComplementario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BReintegro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PBotonesLayout.setVerticalGroup(
            PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BPrimero)
                    .addComponent(BSegundo)
                    .addComponent(BTercero)
                    .addComponent(BCuarto)
                    .addComponent(BReintegro)
                    .addComponent(BComplementario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TAPremios.setEditable(false);
        TAPremios.setColumns(20);
        TAPremios.setRows(5);
        jScrollPane1.setViewportView(TAPremios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(PGanadora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PGanadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGenerarActionPerformed
        BGenerar.setEnabled(false);
        habilitarBotones();
        
        ganadora = new Ganadora();
        
        int contador = 0;
        
        for (Component component : PGanadora.getComponents()) {
            if (component instanceof JTextField) {
                JTextField textfield = (JTextField) component;
                try {
                    textfield.setText(String.valueOf(ganadora.getNumero(contador)));
                    contador++;
                } catch (PrimitivaException ex) {
                    Ventanas.error(component, ex);
                }
            }
        }    
        
    }//GEN-LAST:event_BGenerarActionPerformed

    private void BPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPrimeroActionPerformed
        filtrarBoletos(evt.getActionCommand());
    }//GEN-LAST:event_BPrimeroActionPerformed

    private void BSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSegundoActionPerformed
        filtrarBoletos(evt.getActionCommand());
    }//GEN-LAST:event_BSegundoActionPerformed

    private void BCuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCuartoActionPerformed
        filtrarBoletos(evt.getActionCommand());
    }//GEN-LAST:event_BCuartoActionPerformed

    private void BReintegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReintegroActionPerformed
        filtrarBoletos(evt.getActionCommand());
    }//GEN-LAST:event_BReintegroActionPerformed

    private void BComplementarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BComplementarioActionPerformed
        filtrarBoletos(evt.getActionCommand());
    }//GEN-LAST:event_BComplementarioActionPerformed

    private void BTerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTerceroActionPerformed
        filtrarBoletos(evt.getActionCommand());
    }//GEN-LAST:event_BTerceroActionPerformed

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
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorteo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BComplementario;
    private javax.swing.JButton BCuarto;
    private javax.swing.JButton BGenerar;
    private javax.swing.JButton BPrimero;
    private javax.swing.JButton BReintegro;
    private javax.swing.JButton BSegundo;
    private javax.swing.JButton BTercero;
    private javax.swing.JPanel PBotones;
    private javax.swing.JPanel PGanadora;
    private javax.swing.JTextArea TAPremios;
    private javax.swing.JTextField TFComplementario;
    private javax.swing.JTextField TFGanadora1;
    private javax.swing.JTextField TFGanadora2;
    private javax.swing.JTextField TFGanadora3;
    private javax.swing.JTextField TFGanadora4;
    private javax.swing.JTextField TFGanadora5;
    private javax.swing.JTextField TFGanadora6;
    private javax.swing.JTextField TFReintegro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
