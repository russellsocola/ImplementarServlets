package persistencia;

import java.util.List;
import logica.Usuario;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    //Operacion Crear
    public void crearUsuario(Usuario usu){
        usuJpa.create(usu);
    }
    //Operacion Leer Read+
    public List<Usuario> traerUsuarios(){
        return usuJpa.findUsuarioEntities();
    }
}
