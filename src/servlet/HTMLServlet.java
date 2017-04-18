package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HTMLServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>"
                    + "<head>"
                    + "<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">"
                    + "<title>Документ</title>"
                    + "</head>"
                    + "<body>"
                    + "<table width=\"450\" border=\"0\" cellpadding=\"0\" cellspacing=\"15\">"
                    + "<tr>"
                    + " <td colspan=\"2\" align=\"center\"><strong><font color=\"#FF0000\" size=\"5\">Таблица</font></strong></td>"
                    + " </tr>"
                    + " <tr>"
                    + "   <td width=\"150\" rowspan=\"2\"><img src=\"images/java.png\" alt=\"\" width=\"119\" height=\"222\"></td>"
                    + "  <td width=\"340\" height=\"99\"><table width=\"300\" border=\"1\" align=\"left\" cellpadding=\"15\" cellspacing=\"0\">"
                    + "    <tr>"
                    + "      <th align=\"left\"><font color=\"#006699\"> <strong>Имя</strong></font></th>"
                    + "    <th align=\"left\"><font color=\"#006699\"><strong>Телефон</strong></font></th>"
                    + "  </tr>"
                    + "  <tr>"
                    + "    <td>TTTT</td>"
                    + "   <td>555444</td>"
                    + " </tr>"
                    + " <tr>"
                    + "   <td>KKKK</td>"
                    + "   <td>111222</td>"
                    + " </tr>"
                    + "  </table></td>"
                    + " </tr>"
                    + " <tr>"
                    + "  <td>"
                    + "<ul>"
                    + " <li>документ 1</li>"
                    + " <li>документ 2</li>"
                    + " <li>документ 3</li>"
                    + " </ul>    "
                    + " </td>"
                    + "</tr>"
                    + "  <tr>"
                    + "  <td colspan=\"2\"><p align=\"center\"><font color=\"#999999\">Проект 2</font></p></td>"
                    + "  </tr>"
                    + "</table>"
                    + "</body>"
                    + "</html>");
        } finally {
            out.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
