
package Preguntas;

import javax.swing.JOptionPane;



public class Cuestionario extends javax.swing.JFrame {
    
    int ID;
    int cont=1;
    int bue, mal;
    String jaja;
    Random ran = new Random();
    
    public Cuestionario() {
        initComponents();
        ID = 0;
        
        
        
    }
    
    public void jeje() {
        
         jaja = ran.Aleatorio();
        lbNPregunta.setText("Pregunta " + (ID+1));
        lbPregunta.setText( jaja );
        
//        rboOpcion1.setText(ran.alternativas[Integer.parseInt(jaja)][0]);
//        rboOpcion2.setText(ran.alternativas[Integer.parseInt(jaja)][1]);
//        rboOpcion3.setText(ran.alternativas[Integer.parseInt(jaja)][2]);
        
        
    } 
    
    public void opboby() {
        
//        rboOpcion1.setText(ran.alternativas[jaja][0]);
//        rboOpcion1.setText(alternativas[aleatorio][0]);
//        rboOpcion2.setText(alternativas[aleatorio][1]);
//        rboOpcion3.setText(alternativas[aleatorio][2]);
        
        
    }
    
   
    
//    private void idPregunta() {
//        lbNPregunta.setText("Pregunta Nº " + (ID + 1));
//        String A[] = new String[3];
//        int B[] = new int[A.length];
//        int dado;
//
//        for (int i = 0; i < B.length; i++) {
//            int estado = 0;
//            if (i == 0) {
//                dado = (int) (Math.random() * A.length);
//                B[i] = dado;
//            } else {
//                int k = 0;
//                do {
//                    dado = (int) (Math.random() * A.length);
//                    while (k < i) {
//                        if (dado != B[k]) {
//                            estado++;
//                        }
//                        k++;
//                    }
//                    if (estado == i) {
//                        B[i] = dado;
//                    } else {
//                        estado = 0;
//                        k = 0;
//                    }
//                } while (estado != i);
//            }
//            aleatorio = B[i];
//            lbPregunta.setText(banco_pregunta[aleatorio]);
//        }
//    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GbtoBotones = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbNPregunta = new javax.swing.JLabel();
        lbPregunta = new javax.swing.JLabel();
        rboOpcion1 = new javax.swing.JRadioButton();
        rboOpcion2 = new javax.swing.JRadioButton();
        rboOpcion3 = new javax.swing.JRadioButton();
        bogene = new javax.swing.JButton();
        boeva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(970, 458));
        setPreferredSize(new java.awt.Dimension(970, 458));
        setSize(new java.awt.Dimension(970, 458));

        lbNPregunta.setForeground(new java.awt.Color(51, 0, 255));

        GbtoBotones.add(rboOpcion1);
        rboOpcion1.setText("Opcion 1");

        GbtoBotones.add(rboOpcion2);
        rboOpcion2.setText("Opcion 2");

        GbtoBotones.add(rboOpcion3);
        rboOpcion3.setText("Opcion 3");

        bogene.setText("Generar");
        bogene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bogeneActionPerformed(evt);
            }
        });

        boeva.setText("Evaluar");
        boeva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbNPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(rboOpcion1)
                        .addGap(120, 120, 120)
                        .addComponent(rboOpcion2)
                        .addGap(181, 181, 181)
                        .addComponent(rboOpcion3))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(bogene)
                        .addGap(153, 153, 153)
                        .addComponent(boeva))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lbNPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rboOpcion1)
                    .addComponent(rboOpcion2)
                    .addComponent(rboOpcion3))
                .addGap(64, 64, 64)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bogene)
                    .addComponent(boeva))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(lbNPregunta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbPregunta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rboOpcion1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rboOpcion2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rboOpcion3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bogene, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(boeva, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bogeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bogeneActionPerformed
        // TODO add your handling code here:
        
        jeje();
        
    }//GEN-LAST:event_bogeneActionPerformed

    private void boevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boevaActionPerformed
        // TODO add your handling code here:
        
        
        JOptionPane.showMessageDialog(null, "Sapeeeeee " + ran.respuestas[Integer.parseInt(jaja)] );
        jeje();
        //is la pregunta es buena 
        
        
        //si no
        
        
        
        
    }//GEN-LAST:event_boevaActionPerformed

    
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
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GbtoBotones;
    private javax.swing.JButton boeva;
    private javax.swing.JButton bogene;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lbNPregunta;
    private javax.swing.JLabel lbPregunta;
    private javax.swing.JRadioButton rboOpcion1;
    private javax.swing.JRadioButton rboOpcion2;
    private javax.swing.JRadioButton rboOpcion3;
    // End of variables declaration//GEN-END:variables
}
