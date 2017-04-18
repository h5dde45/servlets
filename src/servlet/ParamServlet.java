package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

//@WebServlet(name = "ParamServlet",urlPatterns = "/ParamServlet")
public class ParamServlet extends HttpServlet {
   private int count;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println(config.getInitParameter("init"));
    }

    protected void progressRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        Enumeration<String> names = request.getParameterNames();

        ++count;
        request.getSession().setAttribute("count",count);

        try{
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParamServlet</title>");
            out.println("</head>");
            out.println("<body>");
            while (names.hasMoreElements()) {
                String s = names.nextElement();
                out.println("<h1> " + s + "=" +
                        request.getParameter(s)+ " </h1>");
            }
            out.println("<h1> " +request.getSession()
                    .getAttribute("count")+ " </h1>");
            out.println("</body>");
            out.println("</html>");
        }finally {
            out.close();
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        progressRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        progressRequest(request, response);
    }
}
