package pl.knpj;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("key", "key from session");
        req.setAttribute("key", "key from request");
        session.setAttribute("keySession", "sessionScope");
        req.setAttribute("keyRequest", "requestScope");
        req.setAttribute("nullAttr", null);
        req.getRequestDispatcher("welcome.jsp").forward(req, resp);
    }

}
