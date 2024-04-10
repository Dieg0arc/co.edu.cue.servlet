package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mapping.dtos.ClientDTO;
import mapping.mapper.ClienteMapper;
import model.Client;
import services.ClientService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value="/student.json")
public class StudentJson extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
        ServletException, IOException {
    ServletInputStream jsonStream = req.getInputStream();
    ObjectMapper mapper = new ObjectMapper();
    Client client = mapper.readValue(jsonStream, Client.class);
    resp.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = resp.getWriter()) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println(" <head>");
        out.println(" <meta charset=\"UTF-8\">");
        out.println(" <title>Detalle del cliente desde json</title>");
        out.println(" </head>");
        out.println(" <body>");
        out.println(" <h1>Detalle del cliente desde json!</h1>");
        out.println("<ul>");
        out.println("<li>Numero: "+ client.getIDnumber() + "</li>");
        out.println("<li>Nombre: " + client.getName() + "</li>");
        out.println("<li>Fecha de nacimiento: " + client.getDate_birth() + "</li>");
        out.println("</ul>");
        out.println(" </body>");
        out.println("</html>");
    }
}
public ClientService service;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        List<ClientDTO> client = service.listar();
        //preguntar linea 50
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(client);
        resp.setContentType("application/json");
        resp.getWriter().write(json);
    }


}
