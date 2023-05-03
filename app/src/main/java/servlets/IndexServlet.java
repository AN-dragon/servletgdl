package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "FlandreIndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //   response.getWriter().println("Oi Servlet!");
      //   response.getWriter().close();

      String nome = request.getParameter("nome");
      request.setAttribute("nome", nome);
      request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);
     }
}