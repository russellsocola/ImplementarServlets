<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista de Usuarios Registrados</h1>
        
        <%
            List <Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            for(Usuario usu : listaUsuarios){
        %>
        <p><b>Usuario N° <%=cont%></b></p>
        <p>DNI :<%=usu.getDni() %></p>
        <p>NOMBRE :<%=usu.getNombre() %></p>
        <p>APELLIDO :<%=usu.getApellido()%></p>
        <p>TELEFONO :<%=usu.getTelefono()%></p>
        <p>-------------------------------------</p>
        <% cont=cont+1; %>
        <%}%>
    </body>
</html>
