package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

public class PanelSimulacion extends JPanel {

    private List<Prioridad> procesos;
    private int procesoActual = -1;
    private int tiempoRestante = 0;
    public int tiempoTotal = 0;
    private int avanceProceso = 0; // progreso parcial del proceso actual

    public void setProcesos(List<Prioridad> procesos) {
        this.procesos = procesos;
        this.procesoActual = -1;
        this.tiempoRestante = 0;
        this.tiempoTotal = 0;
        this.avanceProceso = 0;
        repaint();
    }

    public boolean avanzarSimulacion() {
        if (procesos == null || procesos.isEmpty()) return false;

        if (procesoActual == -1) {
            procesoActual = 0;
            tiempoRestante = procesos.get(0).getTiempoRafaga();
            avanceProceso = 0;
        }

        tiempoRestante--;
        avanceProceso++;
        tiempoTotal++;

        if (tiempoRestante <= 0) {
            procesoActual++;
            if (procesoActual >= procesos.size()) {
                procesoActual = -1;
                repaint();
                return false; // simulación terminada
            }
            tiempoRestante = procesos.get(procesoActual).getTiempoRafaga();
            avanceProceso = 0;
        }

        repaint();
        return true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (procesos == null || procesos.isEmpty()) return;

        int x = 50;
        int y = 50;
        int anchoUnitario = 30;
        int alto = 40;
        int espacioEntreBarras = 20;

        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.drawString("Simulación de Ejecución por Prioridad (Gantt Animado)", 50, 30);

        for (int i = 0; i < procesos.size(); i++) {
            Prioridad p = procesos.get(i);
            int anchoTotal = p.getTiempoRafaga() * anchoUnitario;
            int anchoDibujado = anchoTotal;

            Color color;
            if (i < procesoActual) { // finalizados
                color = new Color(52, 168, 83);
            } else if (i == procesoActual) { // en ejecución
                color = new Color(66, 133, 244);
                anchoDibujado = (int)((avanceProceso / (double)p.getTiempoRafaga()) * anchoTotal);
            } else { // esperando
                color = new Color(200, 200, 200);
                anchoDibujado = 0;
            }

            // Barra
            g.setColor(color);
            g.fillRect(x, y, anchoDibujado, alto);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, anchoTotal, alto);

            // Etiquetas arriba y abajo
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 12));
            g.drawString(p.getNombre(), x + 5, y - 5); // arriba
            g.drawString("P" + p.getPrioridad(), x + anchoTotal / 2 - 10, y + alto + 15); // abajo

            x += anchoTotal + espacioEntreBarras;
        }

        // Tiempo total
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 13));
        g.drawString("Tiempo total: " + tiempoTotal, 50, y + alto + 60);

        // Leyenda
        int baseY = y + alto + 80;
        int baseX = 50;

        g.setColor(new Color(200, 200, 200));
        g.fillRect(baseX, baseY, 15, 10);
        g.setColor(Color.BLACK);
        g.drawString("Esperando", baseX + 20, baseY + 10);

        g.setColor(new Color(66, 133, 244));
        g.fillRect(baseX + 120, baseY, 15, 10);
        g.setColor(Color.BLACK);
        g.drawString("En ejecución", baseX + 140, baseY + 10);

        g.setColor(new Color(52, 168, 83));
        g.fillRect(baseX + 280, baseY, 15, 10);
        g.setColor(Color.BLACK);
        g.drawString("Finalizado", baseX + 300, baseY + 10);
    }
}
