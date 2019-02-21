import java.io.IOException;

import javax.inject.Inject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( name="ListServlet", displayName="ListServlet", urlPatterns = {""}, loadOnStartup=1)
public class StartController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Got a requestt");
        req.setAttribute("helloMessage", "Dit is de site om gegevens op te vragen van een gebruiker");
        req.getRequestDispatcher("/webapp/WEB-INF/index.jsp").forward(req, resp);
    }
}