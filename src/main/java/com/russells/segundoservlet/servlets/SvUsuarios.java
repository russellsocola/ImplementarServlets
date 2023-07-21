package com.russells.segundoservlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Usuario;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("751","Russell","Socola","985289"));
        listaUsuarios.add(new Usuario("7519","Nahum","Reyes","9852896"));
        listaUsuarios.add(new Usuario("75198","Socola","Russell","985289678"));
        listaUsuarios.add(new Usuario("751986","Reyes","Nahum","9852896787"));
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("mostrarUsuarios.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono= request.getParameter("telefono");
        
        System.out.println("El dni es : "+ dni);
        System.out.println("El nombre es : "+ nombre);
        System.out.println("El apellido es : "+ apellido);
        System.out.println("El telefono es : "+ telefono);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
