/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import entidades.Chofer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Marcela
 */
public class PanelChofer extends javax.swing.JPanel {

    Chofer chofer;

    public PanelChofer() {
        initComponents();
    }
    
    private void guardarValoresEditados(String nuevoNombre, String nuevoApellido) {
        try {
            Path archivoChoferes = Paths.get("persistencia/choferes.csv"); // Ruta de tu archivo CSV de choferes

            // Leer todas las líneas del archivo CSV
            var lineas = Files.readAllLines(archivoChoferes, StandardCharsets.UTF_8);

            // Buscar la línea correspondiente al chofer actual y reemplazarla con los nuevos valores
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                String[] valores = linea.split(",");
                // Comparar el número de socio o cualquier otro identificador único del chofer
                if (valores[0].equals(String.valueOf(chofer.getNroSocio()))) {
                    // Reemplazar los valores editados
                    valores[1] = nuevoNombre;
                    valores[2] = nuevoApellido;

                    // Crear una nueva línea con los valores actualizados
                    String nuevaLinea = String.join(",", valores);
                    // Reemplazar la línea antigua con la nueva línea
                    lineas.set(i, nuevaLinea);
                    break; // Salir del bucle una vez que se haya encontrado y actualizado la línea
                }
            }

            // Escribir todas las líneas actualizadas en el archivo CSV
            Files.write(archivoChoferes, lineas);

            System.out.println("Valores editados guardados correctamente en el archivo CSV.");
        } catch (IOException e) {
            System.err.println("Error al guardar los valores editados en el archivo CSV: " + e.getMessage());
        }
    }

    public PanelChofer(Chofer chofer) {
        initComponents();
        this.chofer = chofer;
        TxtNombreChofer.setText(chofer.getNombre());
        TxtApellidoChofer.setText(chofer.getApellido());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void mouseEnter(JPanel panel) {
        Color currentColor = panel.getBackground();
        float[] hsb = Color.RGBtoHSB(currentColor.getRed(), currentColor.getGreen(), currentColor.getBlue(), null);
        float brightness = hsb[2];
        float newBrightness = Math.min(brightness + 0.1f, 1.0f);
        Color newColor = Color.getHSBColor(hsb[0], hsb[1], newBrightness);
        panel.setBackground(newColor);
    }

    private void mouseExit(JPanel panel) {
        Color currentColor = panel.getBackground();
        float[] hsb = Color.RGBtoHSB(currentColor.getRed(), currentColor.getGreen(), currentColor.getBlue(), null);
        float brightness = hsb[2];
        float newBrightness = Math.max(brightness - 0.1f, 0.0f);
        Color newColor = Color.getHSBColor(hsb[0], hsb[1], newBrightness);
        panel.setBackground(newColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtApellidoChofer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNombreChofer = new javax.swing.JTextField();
        PanelEditarColectivoChofer = new javax.swing.JPanel();
        BtnEditarColectivoChofer = new javax.swing.JLabel("Editar colectivo a cargo", SwingConstants.CENTER);
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PanelBtnEditarChofer = new javax.swing.JPanel();
        BtnEditarChofer = new javax.swing.JLabel("Editar", SwingConstants.CENTER);

        Fondo.setBackground(new java.awt.Color(248, 248, 255));
        Fondo.setPreferredSize(new java.awt.Dimension(446, 249));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellido:");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 30));
        Fondo.add(TxtApellidoChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 360, 30));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));
        Fondo.add(TxtNombreChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, 30));

        PanelEditarColectivoChofer.setBackground(new java.awt.Color(112, 169, 161));

        BtnEditarColectivoChofer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnEditarColectivoChofer.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditarColectivoChofer.setText("Editar colectivo a cargo");
        BtnEditarColectivoChofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEditarColectivoChoferMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEditarColectivoChoferMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEditarColectivoChoferMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelEditarColectivoChoferLayout = new javax.swing.GroupLayout(PanelEditarColectivoChofer);
        PanelEditarColectivoChofer.setLayout(PanelEditarColectivoChoferLayout);
        PanelEditarColectivoChoferLayout.setHorizontalGroup(
            PanelEditarColectivoChoferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarColectivoChoferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEditarColectivoChofer, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelEditarColectivoChoferLayout.setVerticalGroup(
            PanelEditarColectivoChoferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarColectivoChoferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEditarColectivoChofer, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        Fondo.add(PanelEditarColectivoChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 430, 30));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nota: Recuerda que para intercambiar los colectivos debes utilizar el boton");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("intercambiar.");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        PanelBtnEditarChofer.setBackground(new java.awt.Color(64, 121, 140));

        BtnEditarChofer.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditarChofer.setText("Editar");
        BtnEditarChofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEditarChoferMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEditarChoferMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEditarChoferMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelBtnEditarChoferLayout = new javax.swing.GroupLayout(PanelBtnEditarChofer);
        PanelBtnEditarChofer.setLayout(PanelBtnEditarChoferLayout);
        PanelBtnEditarChoferLayout.setHorizontalGroup(
            PanelBtnEditarChoferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBtnEditarChoferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEditarChofer, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBtnEditarChoferLayout.setVerticalGroup(
            PanelBtnEditarChoferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBtnEditarChoferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEditarChofer, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        Fondo.add(PanelBtnEditarChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEditarColectivoChoferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarColectivoChoferMouseClicked
        // TODO add your handling code here:
        PanelColectivo mostrarDataColectivo = new PanelColectivo(chofer.getColectivo());
        mostrarDataColectivo.setSize(950, 590);
        mostrarDataColectivo.setLocation(0, 0);

        this.removeAll();
        this.add(mostrarDataColectivo, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_BtnEditarColectivoChoferMouseClicked

    private void BtnEditarColectivoChoferMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarColectivoChoferMouseEntered
        // TODO add your handling code here:
        mouseEnter(PanelEditarColectivoChofer);
    }//GEN-LAST:event_BtnEditarColectivoChoferMouseEntered

    private void BtnEditarColectivoChoferMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarColectivoChoferMouseExited
        // TODO add your handling code here:
        mouseExit(PanelEditarColectivoChofer);
    }//GEN-LAST:event_BtnEditarColectivoChoferMouseExited

    private void BtnEditarChoferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarChoferMouseClicked
        // TODO add your handling code here:
        String nuevoNombre = TxtNombreChofer.getText();
        String nuevoApellido = TxtApellidoChofer.getText();

        guardarValoresEditados(nuevoNombre, nuevoApellido);
    }//GEN-LAST:event_BtnEditarChoferMouseClicked

    private void BtnEditarChoferMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarChoferMouseEntered
        // TODO add your handling code here:
        mouseEnter(PanelBtnEditarChofer);
    }//GEN-LAST:event_BtnEditarChoferMouseEntered

    private void BtnEditarChoferMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarChoferMouseExited
        // TODO add your handling code here:
        mouseExit(PanelBtnEditarChofer);
    }//GEN-LAST:event_BtnEditarChoferMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnEditarChofer;
    private javax.swing.JLabel BtnEditarColectivoChofer;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel PanelBtnEditarChofer;
    private javax.swing.JPanel PanelEditarColectivoChofer;
    private javax.swing.JTextField TxtApellidoChofer;
    private javax.swing.JTextField TxtNombreChofer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
