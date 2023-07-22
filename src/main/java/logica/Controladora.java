package logica;

import persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();
    
    public void crearUsuario(Usuario usu){
        controladoraPersis.crearUsuario(usu);
    }
    
    public List<Usuario> traerUsuarios(){
        return controladoraPersis.traerUsuarios();
    }

    public void borrarUsuario(int id_eliminar) {
        controladoraPersis.borrarUsuario(id_eliminar);
    
    }
}
