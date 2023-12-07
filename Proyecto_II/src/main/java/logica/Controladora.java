package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String color, String motor, String patente, Integer puertas) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setPuertas(puertas);

        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerDatosAutomovil() {
        return controlPersis.traerDatosAutomovil();
    }

    public void eliminarAuto(int idAuto) {
        controlPersis.eliminarAuto(idAuto);
    }

    public Automovil traerAutoSeleccionado(int idAuto) {
        return controlPersis.traerAutoSeleccionado(idAuto);
    }

    public void modificarAutomovil(Automovil auto, String modelo, String marca, String color, String motor, String patente, Integer puertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setPuertas(puertas);

        controlPersis.modificarAutomovil(auto);
    }
}
