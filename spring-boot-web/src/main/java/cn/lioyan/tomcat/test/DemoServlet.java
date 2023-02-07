package cn.lioyan.tomcat.test;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * {@link DemoServlet}
 *
 * @author com.lioyan
 * @date 2023/2/7  10:23
 */
public class DemoServlet  extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        out.println("lilili");
    }
}
