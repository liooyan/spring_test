package cn.lioyan.tomcat.test;

import javax.servlet.*;
import java.io.IOException;


/**
 * {@link MyFilter}
 *
 * @author com.lioyan
 * @date 2023/2/9  16:17
 */
public class MyFilter implements Filter
{
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException
    {
        System.out.println(request);
    }
}
