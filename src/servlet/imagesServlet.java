package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "imagesServlet", urlPatterns = "/imagesServlet")
public class imagesServlet extends HttpServlet {

    protected void progressRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try{
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowImage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet image 1: </h1>");
            out.println("<img src='images/ibm.jpg'/>");
            out.println("<h1>Servlet image 2: </h1>");
            out.println("<img src='"+request.getContextPath()+"/images/oracle.jpg" +"'/>");
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
