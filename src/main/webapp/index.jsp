<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Usuarios</title>
    </head>
    <body>
        <h1>Datos de Usuario</h1>
        <form action="SvUsuarios" method="POST">
            <p><label>Dni:</label><input type="text" name="dni"></p>
            <p><label>Nombre:</label><input type="text" name="nombre"></p>
            <p><label>Apellido:</label><input type="text" name="apellido"></p>
            <p><label>Telefono:</label><input type="text" name="telefono"></p>
            <button  type="submit">Enviar</button>
        </form>
        
        <h1>Ver lista de Usuario</h1>
        <p>Para ver los datos de los usuarios cargados haga click en el siguiente boton</p>
        <form action="SvUsuarios" method="GET">
            <button type="submit">Mostrar Usuarios</button>
        </form>
        
        <h1>Eliminar Usuario</h1>
        <p>Ingrese el Id del Usuario que desea Eliminar</p>
        <form action="SvEliminar" method="POST">
            <p><label>ID:</label><input type="text" name="id_usuario"></p>
            <button type="submit">Eliminar Usuarios</button>
        </form>
        
        <h1>Editar Usuario</h1>
        <p>Ingrese el Id del Usuario que desea Editar</p>
        <form action="SvEditar" method="GET">
            <p><label>ID:</label><input type="text" name="id_usuarioEdit"></p>
            <button type="submit">Editar Usuarios</button>
        </form>
    </body>
</html>
