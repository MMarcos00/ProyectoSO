package clases;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Prioridad {
    private String nombre;
    private int tiempoLlegada;
    private int tiempoRafaga;
    private int prioridad;
    private int tiempoEspera;
    private int tiempoRetorno;
    private int tiempoFinalizacion;

    public Prioridad(String nombre, int tiempoLlegada, int tiempoRafaga, int prioridad) {
        this.nombre = nombre;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoRafaga = tiempoRafaga;
        this.prioridad = prioridad;
        this.tiempoEspera = 0;
        this.tiempoRetorno = 0;
        this.tiempoFinalizacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public int getTiempoRafaga() {
        return tiempoRafaga;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public int getTiempoRetorno() {
        return tiempoRetorno;
    }

    public void setTiempoRetorno(int tiempoRetorno) {
        this.tiempoRetorno = tiempoRetorno;
    }

    public int getTiempoFinalizacion() {
        return tiempoFinalizacion;
    }

    public void setTiempoFinalizacion(int tiempoFinalizacion) {
        this.tiempoFinalizacion = tiempoFinalizacion;
    }

    public static List<Prioridad> calcularPrioridad(List<Prioridad> listaProcesos) {
        List<Prioridad> resultado = new ArrayList<>();
        List<Prioridad> pendientes = new ArrayList<>(listaProcesos);
        int tiempoActual = 0;

        while (!pendientes.isEmpty()) {
            List<Prioridad> disponibles = new ArrayList<>();
            for (Prioridad p : pendientes) {
                if (p.getTiempoLlegada() <= tiempoActual) {
                    disponibles.add(p);
                }
            }

            if (disponibles.isEmpty()) {
                int siguienteLlegada = pendientes.stream()
                        .mapToInt(Prioridad::getTiempoLlegada)
                        .min()
                        .orElse(tiempoActual);
                tiempoActual = siguienteLlegada;
                continue;
            }

            Prioridad procesoActual = disponibles.stream()
                    .min(Comparator.comparingInt(Prioridad::getPrioridad)
                            .thenComparingInt(Prioridad::getTiempoLlegada))
                    .orElse(null);

            if (procesoActual != null) {
                // Tiempo de espera = tiempo actual - tiempo de llegada
                procesoActual.setTiempoEspera(tiempoActual - procesoActual.getTiempoLlegada());
                
                // Actualizar tiempo actual (tiempo de finalización)
                tiempoActual += procesoActual.getTiempoRafaga();
                procesoActual.setTiempoFinalizacion(tiempoActual);
                
                // ¡CAMBIO AQUÍ! Tiempo de retorno = tiempo de finalización (SIN restar llegada)
                procesoActual.setTiempoRetorno(tiempoActual);

                resultado.add(procesoActual);
                pendientes.remove(procesoActual);
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Proceso: " + nombre
                + " | Llegada: " + tiempoLlegada
                + " | Ráfaga: " + tiempoRafaga
                + " | Prioridad: " + prioridad
                + " | Espera: " + tiempoEspera
                + " | Retorno: " + tiempoRetorno;
    }
}