package cn.lioyan.tomcat.test;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 * {@link DemoServlet}
 *
 * @author com.lioyan
 * @date 2023/2/7  10:23
 */
public class DemoServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        out.println("lilili");
    }

    /**
     * 关于 http 上传文件的格式
     *





     ----------------------------060104629903327142137689
     Content-Disposition: form-data; name="file1"; filename="Main.java"
     Content-Type: text/x-java-source

     文本内容
     ----------------------------060104629903327142137689
     Content-Disposition: form-data; name="file2"; filename="Servlet.java"
     Content-Type: text/x-java-source

     文本内容
     ----------------------------060104629903327142137689
     Content-Disposition: form-data; name="name"

     run
     ----------------------------060104629903327142137689--




     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        ServletInputStream inputStream = req.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        reader.lines().forEach(System.out::println);

    }
}
