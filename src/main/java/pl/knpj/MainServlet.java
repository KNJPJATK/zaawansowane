package pl.knpj;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(urlPatterns = "/admin")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        throw new ServletException("My awesome runtime exc");
//        resp.setStatus(HttpServletResponse.SC_OK);
//        Writer writer = resp.getWriter();
//        writer.write("Test");
//        writer.flush();
//        writer.close();
    }

}
