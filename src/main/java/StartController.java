import model.PersonDao;

import java.io.IOException;

import javax.ejb.EJB;
import javax.inject.Inject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( name="ListServlet", displayName="ListServlet", urlPatterns = {"/test"}, loadOnStartup=1)
public class StartController extends HttpServlet {

    @EJB
    private PersonDao personDao;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Got a requestt");
        long id = Integer.parseInt(req.getParameter("personid"));
        req.setAttribute("person",  personDao.find(id));
        req.getRequestDispatcher("receiverpage.jsp").forward(req, resp);
    }
}