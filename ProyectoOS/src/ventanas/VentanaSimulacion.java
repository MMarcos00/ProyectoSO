/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.PanelSimulacion;
import clases.Prioridad;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Marcos
 */
public class VentanaSimulacion extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaSimulacion.class.getName());
    private Timer timer;
    private List<Prioridad> listaProcesos;
    private boolean simulacionIniciada = false;
    private PanelSimulacion panelSimulacionCustom;
    private String nombreUsuario;

    /**
     * Creates new form VentanaSimulacion
     */
    public VentanaSimulacion() {
        initComponents();

        panelSimulacionCustom = new PanelSimulacion();
        panelSimulacionCustom.setBackground(Color.WHITE);

        jPanel1.removeAll();
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panelSimulacionCustom, java.awt.BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();

        btnPausar.setEnabled(false);
        btnReiniciar.setEnabled(false);

    }

    public VentanaSimulacion(List<Prioridad> procesos, String nombreUsuario) {
        initComponents();
        setResizable(false);
        setTitle("Simulación");
        setLocationRelativeTo(null);

        this.listaProcesos = procesos;
        this.nombreUsuario = nombreUsuario;

        // Mostrar el nombre del usuario en lblUsuario
        lblUsuario.setText("Usuario: " + nombreUsuario);

        panelSimulacionCustom = new PanelSimulacion();
        panelSimulacionCustom.setBackground(Color.WHITE);

        jPanel1.removeAll();
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panelSimulacionCustom, java.awt.BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();

        if (listaProcesos != null && !listaProcesos.isEmpty()) {
            panelSimulacionCustom.setProcesos(listaProcesos);
        }

        btnPausar.setEnabled(false);
        btnReiniciar.setEnabled(false);

        ImageIcon wallpaper = new ImageIcon("src/imagenes/fondo2.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(lblWallpaper.getWidth(), lblWallpaper.getHeight(), Image.SCALE_SMOOTH));
        lblWallpaper.setIcon(icono);
        this.repaint();

        ImageIcon pdf = new ImageIcon(getClass().getResource("/imagenes/pdf.png"));
        Image pd = pdf.getImage().getScaledInstance(btnPDF.getWidth(), btnPDF.getHeight(), Image.SCALE_SMOOTH);
        btnPDF.setIcon(new ImageIcon(pd));
        btnPDF.setContentAreaFilled(false);
        btnPDF.setBorderPainted(false);
        btnPDF.setFocusPainted(false);
        btnPDF.setOpaque(false);

        ImageIcon rei = new ImageIcon(getClass().getResource("/imagenes/reini.png"));
        Image reini = rei.getImage().getScaledInstance(btnReiniciar.getWidth(), btnReiniciar.getHeight(), Image.SCALE_SMOOTH);
        btnReiniciar.setIcon(new ImageIcon(reini));
        btnReiniciar.setContentAreaFilled(false);
        btnReiniciar.setBorderPainted(false);
        btnReiniciar.setFocusPainted(false);
        btnReiniciar.setOpaque(false);

        ImageIcon pau = new ImageIcon(getClass().getResource("/imagenes/pau.png"));
        Image sar = pau.getImage().getScaledInstance(btnPausar.getWidth(), btnPausar.getHeight(), Image.SCALE_SMOOTH);
        btnPausar.setIcon(new ImageIcon(sar));
        btnPausar.setContentAreaFilled(false);
        btnPausar.setBorderPainted(false);
        btnPausar.setFocusPainted(false);
        btnPausar.setOpaque(false);

        ImageIcon pla = new ImageIcon(getClass().getResource("/imagenes/play.png"));
        Image y = pla.getImage().getScaledInstance(btnIniciar.getWidth(), btnIniciar.getHeight(), Image.SCALE_SMOOTH);
        btnIniciar.setIcon(new ImageIcon(y));
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setBorderPainted(false);
        btnIniciar.setFocusPainted(false);
        btnIniciar.setOpaque(false);

        ImageIcon vol = new ImageIcon(getClass().getResource("/imagenes/volver.png"));
        Image re = vol.getImage().getScaledInstance(btnRegresar.getWidth(), btnRegresar.getHeight(), Image.SCALE_SMOOTH);
        btnRegresar.setIcon(new ImageIcon(re));
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setOpaque(false);
        
        ImageIcon iconSalir = new ImageIcon(getClass().getResource("/imagenes/exit.png"));
        Image imgSalir = iconSalir.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(), Image.SCALE_SMOOTH);
        btnSalir.setIcon(new ImageIcon(imgSalir));
        btnSalir.setContentAreaFilled(false); 
        btnSalir.setBorderPainted(false);     
        btnSalir.setFocusPainted(false);    
        btnSalir.setOpaque(false); 
    }

    @Override
    public Image getIconImage() {
        Image retValue;
        retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo3.png"));
        return retValue;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPDF = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario:");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        btnIniciar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 60, 50));

        btnPausar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 60, 50));

        btnReiniciar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 60, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 840, 240));

        btnPDF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        getContentPane().add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 60, 50));

        lblTitulo1.setFont(new java.awt.Font("Onyx", 0, 50)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Simulación de Procesos por Prioridad");
        getContentPane().add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 450, -1));

        btnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 60, 50));

        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 60, 50));
        getContentPane().add(lblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        if (timer != null && timer.isRunning()) {
            timer.stop();
            btnPausar.setText("Reanudar");
            btnIniciar.setEnabled(true);
        } else if (timer != null) {
            timer.start();
            btnPausar.setText("Pausar");
            btnIniciar.setEnabled(false);
        }
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        if (listaProcesos != null && !listaProcesos.isEmpty()) {
            panelSimulacionCustom.setProcesos(listaProcesos);
            simulacionIniciada = false;
        }

        btnIniciar.setEnabled(true);
        btnPausar.setEnabled(false);
        btnPausar.setText("Pausar");
        btnReiniciar.setEnabled(false);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Detener simulación si está corriendo
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        // Volver a la ventana principal pasando el nombre de usuario
        new Principal(nombreUsuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (listaProcesos == null || listaProcesos.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No hay procesos para simular.\nPor favor, agregue procesos primero.",
                    "Advertencia",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!simulacionIniciada) {
            panelSimulacionCustom.setProcesos(listaProcesos);
            simulacionIniciada = true;
        }

        if (timer != null && timer.isRunning()) {
            return;
        }

        timer = new Timer(1000, e -> {
            boolean continuar = panelSimulacionCustom.avanzarSimulacion();
            if (!continuar) {
                timer.stop();
                btnIniciar.setEnabled(false);
                btnPausar.setEnabled(false);
                btnReiniciar.setEnabled(true);
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Simulación completada",
                        "Información",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        });
        timer.start();

        btnIniciar.setEnabled(false);
        btnPausar.setEnabled(true);
        btnReiniciar.setEnabled(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        if (listaProcesos == null || listaProcesos.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No hay procesos para generar el reporte.",
                    "Advertencia",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String desktop = System.getProperty("user.home") + "/Desktop";
            String baseArchivo = desktop + "/Reporte_Prioridad";
            String archivo = baseArchivo + ".pdf";

            // Verificar si ya existe un archivo y sumar número
            int contador = 1;
            while (new java.io.File(archivo).exists()) {
                archivo = baseArchivo + "_" + contador + ".pdf";
                contador++;
            }

            com.itextpdf.text.Document document = new com.itextpdf.text.Document();
            com.itextpdf.text.pdf.PdfWriter writer = com.itextpdf.text.pdf.PdfWriter.getInstance(document, new java.io.FileOutputStream(archivo));
            document.open();

            // --- AGREGAR IMAGEN DE FONDO ---
            String rutaLogo = "src/imagenes/umg.png"; // Ruta de tu logo
            com.itextpdf.text.Image img = com.itextpdf.text.Image.getInstance(rutaLogo);

            // Escalar imagen para que ocupe la hoja
            img.scaleToFit(document.getPageSize().getWidth() - 50, document.getPageSize().getHeight() - 50);

            // Centrar imagen
            img.setAbsolutePosition(
                    (document.getPageSize().getWidth() - img.getScaledWidth()) / 2,
                    (document.getPageSize().getHeight() - img.getScaledHeight()) / 2
            );

            // Transparencia
            com.itextpdf.text.pdf.PdfContentByte canvas = writer.getDirectContentUnder();
            com.itextpdf.text.pdf.PdfGState gState = new com.itextpdf.text.pdf.PdfGState();
            gState.setFillOpacity(0.15f); // 15% de opacidad
            canvas.setGState(gState);
            canvas.addImage(img);
            // ----------------------------------

            // Fuente elegante para el título
            com.itextpdf.text.Font fontTitulo = new com.itextpdf.text.Font(
                    com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 18, com.itextpdf.text.Font.BOLD, new com.itextpdf.text.BaseColor(0, 51, 102));
            com.itextpdf.text.Paragraph titulo = new com.itextpdf.text.Paragraph(
                    "Simulación de Prioridad - Planificador de Procesos", fontTitulo);
            titulo.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            titulo.setSpacingAfter(20);
            document.add(titulo);

            // Tabla con estilo profesional
            com.itextpdf.text.pdf.PdfPTable table = new com.itextpdf.text.pdf.PdfPTable(3);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            // Encabezados
            String[] encabezados = {"Nombre", "Prioridad", "Tiempo de Ráfaga"};
            com.itextpdf.text.Font fontHeader = new com.itextpdf.text.Font(
                    com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 12, com.itextpdf.text.Font.BOLD, com.itextpdf.text.BaseColor.WHITE);

            for (String encabezado : encabezados) {
                com.itextpdf.text.pdf.PdfPCell cell = new com.itextpdf.text.pdf.PdfPCell(new com.itextpdf.text.Phrase(encabezado, fontHeader));
                cell.setBackgroundColor(new com.itextpdf.text.BaseColor(0, 102, 204));
                cell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
                cell.setPadding(8);
                cell.setBorderWidth(1.5f);
                table.addCell(cell);
            }

            // Celdas de contenido con alternancia de colores
            com.itextpdf.text.Font fontContenido = new com.itextpdf.text.Font(
                    com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 12, com.itextpdf.text.Font.NORMAL, com.itextpdf.text.BaseColor.BLACK);

            boolean alternarColor = false;
            for (Prioridad p : listaProcesos) {
                java.awt.Color filaColor = alternarColor ? new java.awt.Color(230, 230, 230) : java.awt.Color.WHITE;

                com.itextpdf.text.pdf.PdfPCell cellNombre = new com.itextpdf.text.pdf.PdfPCell(new com.itextpdf.text.Phrase(p.getNombre(), fontContenido));
                cellNombre.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
                cellNombre.setBackgroundColor(new com.itextpdf.text.BaseColor(filaColor.getRed(), filaColor.getGreen(), filaColor.getBlue()));
                cellNombre.setBorderWidth(1f);
                table.addCell(cellNombre);

                com.itextpdf.text.pdf.PdfPCell cellPrioridad = new com.itextpdf.text.pdf.PdfPCell(new com.itextpdf.text.Phrase(String.valueOf(p.getPrioridad()), fontContenido));
                cellPrioridad.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
                cellPrioridad.setBackgroundColor(new com.itextpdf.text.BaseColor(filaColor.getRed(), filaColor.getGreen(), filaColor.getBlue()));
                cellPrioridad.setBorderWidth(1f);
                table.addCell(cellPrioridad);

                com.itextpdf.text.pdf.PdfPCell cellTiempo = new com.itextpdf.text.pdf.PdfPCell(new com.itextpdf.text.Phrase(String.valueOf(p.getTiempoRafaga()), fontContenido));
                cellTiempo.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
                cellTiempo.setBackgroundColor(new com.itextpdf.text.BaseColor(filaColor.getRed(), filaColor.getGreen(), filaColor.getBlue()));
                cellTiempo.setBorderWidth(1f);
                table.addCell(cellTiempo);

                alternarColor = !alternarColor;
            }

            document.add(table);
// --- RESUMEN ESTADÍSTICO ---
            double sumaEspera = 0;
            double sumaRetorno = 0;
            int tiempoTotalCPU = 0;

            for (Prioridad p : listaProcesos) {
                sumaEspera += p.getTiempoEspera();          // asegúrate de tener este dato calculado
                sumaRetorno += p.getTiempoEspera() + p.getTiempoRafaga();
                tiempoTotalCPU += p.getTiempoRafaga();
            }

            double tme = sumaEspera / listaProcesos.size();
            double ttr = sumaRetorno / listaProcesos.size();
            double cpuUtil = ((double) tiempoTotalCPU / panelSimulacionCustom.tiempoTotal) * 100;

// Fuente más grande y color negro
            com.itextpdf.text.Font fontResumen = new com.itextpdf.text.Font(
                    com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 14, com.itextpdf.text.Font.BOLD, com.itextpdf.text.BaseColor.BLACK);

            com.itextpdf.text.Paragraph resumen = new com.itextpdf.text.Paragraph(
                    "Resumen Estadístico:\n"
                    + "Tiempo promedio de espera: " + String.format("%.2f", tme) + " unidades\n"
                    + "Tiempo de retorno promedio: " + String.format("%.2f", ttr) + " unidades\n"
                    + "Porcentaje de utilización de CPU: " + String.format("%.2f", cpuUtil) + "%",
                    fontResumen);

// Alinear a la izquierda
            resumen.setAlignment(com.itextpdf.text.Element.ALIGN_LEFT);
            resumen.setSpacingBefore(15f);

            document.add(resumen);

            // Información del algoritmo centrada y elegante (ahora con estilo de resumen estadístico)
            com.itextpdf.text.Font fontInfo = new com.itextpdf.text.Font(
                    com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 14, com.itextpdf.text.Font.BOLD, com.itextpdf.text.BaseColor.BLACK);
            com.itextpdf.text.Paragraph info = new com.itextpdf.text.Paragraph(
                    "Tiempo total de ejecución: " + panelSimulacionCustom.tiempoTotal + " unidades", fontInfo);
            info.setAlignment(com.itextpdf.text.Element.ALIGN_LEFT); // alineación a la izquierda
            info.setSpacingBefore(10f); // un poco de espacio antes
            document.add(info);

            document.close();

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Reporte generado exitosamente en el escritorio:\n" + archivo,
                    "Éxito",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Error al generar el PDF:\n" + e.getMessage(),
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    public void setProcesos(List<Prioridad> procesos) {
        this.listaProcesos = procesos;
        if (listaProcesos != null && !listaProcesos.isEmpty()) {
            panelSimulacionCustom.setProcesos(listaProcesos);
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblWallpaper;
    // End of variables declaration//GEN-END:variables
}
