
package com.github.prerna.servlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet(urlPatterns = "/demo")
public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<html><body>");
        pw.println("Welcome to Servlet");
        pw.println("</body></html>");

        pw.close();
    }
    
}
