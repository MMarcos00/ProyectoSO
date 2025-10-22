/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Prioridad;
import java.util.ArrayList;
import java.util.List;
import clases.PanelSimulacion;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class Principal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
// Variables globales
    private String nombreUsuario;
    private List<Prioridad> listaProcesos = new ArrayList<>();
    private DefaultTableModel modeloTabla = new DefaultTableModel(
            new Object[]{"N. Proceso", "T. Llegada", "T. Ejecución", "Prioridad"}, 0
    );

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        lblFooter.setText("Bienvenido a nuestra interfaz");

    }

    public Principal(String nombreUsuario) {
        initComponents();
        setResizable(false);
        setTitle("Datos");
        setLocationRelativeTo(null);
        this.nombreUsuario = nombreUsuario;
        modeloTabla = (DefaultTableModel) tblProcesos.getModel();
        modeloTabla.setRowCount(0);
        lblFooter.setText("Bienvenido a nuestra interfaz: " + nombreUsuario);

        // === Restricciones de entrada ===
        txtNombreProceso.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) || txtNombreProceso.getText().length() >= 1) {
                    e.consume();
                }
            }
        });

        java.awt.event.KeyAdapter numericLimiter = new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                javax.swing.JTextField field = (javax.swing.JTextField) e.getSource();
                if (!Character.isDigit(c) || field.getText().length() >= 2) {
                    e.consume();
                }
            }
        };
        txtLlegada.addKeyListener(numericLimiter);
        txtBurst.addKeyListener(numericLimiter);
        txtPrioridad.addKeyListener(numericLimiter);

        ImageIcon wallpaper = new ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"));
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(lblWallpaper.getWidth(), lblWallpaper.getHeight(), Image.SCALE_SMOOTH));
        lblWallpaper.setIcon(icono);
        this.repaint();

        ImageIcon iconSalir = new ImageIcon(getClass().getResource("/imagenes/exit.png"));
        Image imgSalir = iconSalir.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(), Image.SCALE_SMOOTH);
        btnSalir.setIcon(new ImageIcon(imgSalir));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setOpaque(false);

        ImageIcon calcular = new ImageIcon(getClass().getResource("/imagenes/cal.png"));
        Image cal = calcular.getImage().getScaledInstance(btnCalcular.getWidth(), btnCalcular.getHeight(), Image.SCALE_SMOOTH);
        btnCalcular.setIcon(new ImageIcon(cal));
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setFocusPainted(false);
        btnCalcular.setOpaque(false);

        ImageIcon borra = new ImageIcon(getClass().getResource("/imagenes/borrar.png"));
        Image bor = borra.getImage().getScaledInstance(btnBorrar.getWidth(), btnBorrar.getHeight(), Image.SCALE_SMOOTH);
        btnBorrar.setIcon(new ImageIcon(bor));
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setBorderPainted(false);
        btnBorrar.setFocusPainted(false);
        btnBorrar.setOpaque(false);

        ImageIcon ag = new ImageIcon(getClass().getResource("/imagenes/agrea.png"));
        Image agre = ag.getImage().getScaledInstance(btnAgregar.getWidth(), btnAgregar.getHeight(), Image.SCALE_SMOOTH);
        btnAgregar.setIcon(new ImageIcon(agre));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.setOpaque(false);

        ImageIcon dia = new ImageIcon(getClass().getResource("/imagenes/dia.png"));
        Image gra = dia.getImage().getScaledInstance(btnSimulacion.getWidth(), btnSimulacion.getHeight(), Image.SCALE_SMOOTH);
        btnSimulacion.setIcon(new ImageIcon(gra));
        btnSimulacion.setContentAreaFilled(false);
        btnSimulacion.setBorderPainted(false);
        btnSimulacion.setFocusPainted(false);
        btnSimulacion.setOpaque(false);
    }

    @Override
    public Image getIconImage() {
        Image retValue;
        retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo2.png"));
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

        lblNombre = new javax.swing.JLabel();
        txtNombreProceso = new javax.swing.JTextField();
        lblLlegada = new javax.swing.JLabel();
        txtLlegada = new javax.swing.JTextField();
        lblBurst = new javax.swing.JLabel();
        txtBurst = new javax.swing.JTextField();
        lblPrioridad = new javax.swing.JLabel();
        txtPrioridad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcesos = new javax.swing.JTable();
        lblResultado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSimulacion = new javax.swing.JButton();
        lblFooter = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre del Proceso:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtNombreProceso.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        txtNombreProceso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreProceso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombreProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProcesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 80, -1));

        lblLlegada.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        lblLlegada.setForeground(new java.awt.Color(255, 255, 255));
        lblLlegada.setText("Tiempo de Llegada:");
        getContentPane().add(lblLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtLlegada.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        txtLlegada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLlegada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLlegadaActionPerformed(evt);
            }
        });
        getContentPane().add(txtLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, -1));

        lblBurst.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        lblBurst.setForeground(new java.awt.Color(255, 255, 255));
        lblBurst.setText("Tiempo de Ejecución:");
        getContentPane().add(lblBurst, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtBurst.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        txtBurst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBurst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBurst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBurstActionPerformed(evt);
            }
        });
        getContentPane().add(txtBurst, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 100, -1));

        lblPrioridad.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        lblPrioridad.setForeground(new java.awt.Color(255, 255, 255));
        lblPrioridad.setText("Prioridad:");
        getContentPane().add(lblPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtPrioridad.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        txtPrioridad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrioridad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 150, -1));

        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 70, 70));

        btnCalcular.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 70, 70));

        tblProcesos.setBackground(new java.awt.Color(153, 153, 153));
        tblProcesos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblProcesos.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tblProcesos.setForeground(new java.awt.Color(255, 255, 255));
        tblProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N. Proceso", "T. Llegada", "T. Ejecución", "Prioridad"
            }
        ));
        jScrollPane1.setViewportView(tblProcesos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 390, 110));

        lblResultado.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setText("Orden de ejecución");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(153, 153, 153));
        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setRows(5);
        txtResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(txtResultado);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 580, 140));

        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 70, 70));

        btnBorrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 70, 70));

        btnSimulacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 70, 70));

        lblFooter.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        lblFooter.setForeground(new java.awt.Color(255, 255, 255));
        lblFooter.setText("Bienvenido a nuestra interfaz: ");
        getContentPane().add(lblFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Onyx", 0, 50)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Algoritmo Prioridad");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));
        getContentPane().add(lblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProcesoActionPerformed

    private void txtLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLlegadaActionPerformed

    private void txtBurstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBurstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBurstActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            String nombre = txtNombreProceso.getText().trim();
            String llegadaTxt = txtLlegada.getText().trim();
            String burstTxt = txtBurst.getText().trim();
            String prioridadTxt = txtPrioridad.getText().trim();

            // Validaciones básicas
            if (nombre.isEmpty() || llegadaTxt.isEmpty() || burstTxt.isEmpty() || prioridadTxt.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar nombre (solo letras y sin espacios)
            if (nombre.contains(" ") || !nombre.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras y sin espacios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int llegada = Integer.parseInt(llegadaTxt);
            int rafaga = Integer.parseInt(burstTxt);
            int prioridad = Integer.parseInt(prioridadTxt);

            // Validar que los valores sean mayores a 0
            if (rafaga <= 0 || prioridad <= 0) {
                JOptionPane.showMessageDialog(this, "La ráfaga y prioridad deben ser mayores a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear y agregar proceso
            Prioridad p = new Prioridad(nombre, llegada, rafaga, prioridad);
            listaProcesos.add(p);

            // Mostrar en tabla
            modeloTabla.addRow(new Object[]{nombre, llegada, rafaga, prioridad});

            // Limpiar campos
            txtNombreProceso.setText("");
            txtLlegada.setText("");
            txtBurst.setText("");
            txtPrioridad.setText("");

            // Enfocar el campo nombre para agilizar la captura
            txtNombreProceso.requestFocus();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verifique que los valores numéricos sean válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (listaProcesos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay procesos para calcular.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        List<Prioridad> resultado = Prioridad.calcularPrioridad(listaProcesos);

        // Mostrar resultados en texto
        StringBuilder sb = new StringBuilder();
        sb.append("═══════════════════════════════════════════════════\n");
        sb.append("       ORDEN DE EJECUCIÓN (POR PRIORIDAD)\n");
        sb.append("═══════════════════════════════════════════════════\n\n");

        for (Prioridad p : resultado) {
            sb.append(p.toString()).append("\n");
        }

        txtResultado.setText(sb.toString());
        txtResultado.setCaretPosition(0); // Lleva el scroll arriba
        txtResultado.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 13));


    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Desea borrar todos los datos?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            listaProcesos.clear();
            modeloTabla.setRowCount(0);
            txtResultado.setText("");
            txtNombreProceso.setText("");
            txtLlegada.setText("");
            txtBurst.setText("");
            txtPrioridad.setText("");
            JOptionPane.showMessageDialog(this, "Datos borrados exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulacionActionPerformed
        // Validar que haya procesos
        if (listaProcesos.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No hay procesos para simular.\nPor favor, agregue procesos primero.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar que haya al menos 2 procesos para una simulación significativa
        if (listaProcesos.size() < 2) {
            int opcion = JOptionPane.showConfirmDialog(this,
                    "Solo hay 1 proceso.\n¿Desea continuar con la simulación de todos modos?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (opcion != JOptionPane.YES_OPTION) {
                return;
            }
        }

        try {
            // Calcular el orden de ejecución con el algoritmo de prioridad
            List<Prioridad> resultado = Prioridad.calcularPrioridad(listaProcesos);

            // Crear y mostrar la ventana de simulación
            VentanaSimulacion ventanaSimulacion = new VentanaSimulacion(resultado, nombreUsuario);
            ventanaSimulacion.setVisible(true);

            // Cerrar la ventana actual
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al iniciar la simulación:\n" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSimulacionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSimulacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBurst;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JLabel lblLlegada;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrioridad;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblWallpaper;
    private javax.swing.JTable tblProcesos;
    private javax.swing.JTextField txtBurst;
    private javax.swing.JTextField txtLlegada;
    private javax.swing.JTextField txtNombreProceso;
    private javax.swing.JTextField txtPrioridad;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
