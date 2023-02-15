package cn.lioyan.tomcat.web.util.pattern;

import org.springframework.http.server.PathContainer;
import org.springframework.web.util.pattern.PathPattern;


/**
 * {@link org.springframework.web.util.pattern.PathPatternParser}
 * <pre>
 * url 路径匹配， 可以有
 *  / ** / *.html
 *  /hello/{p1}/{p2}
 *
 *  等不同默认的匹配。
 *  matches 方法判断当前url 是否符合匹配规则
 *  matchStartOfPath 解析url 将url中的参数取出
 *
 *
 * </pre>
 *
 *
 * @author com.lioyan
 * @date 2023/2/14  14:18
 */
public class PathPatternParser
{
    public static void main(String[] args)
    {
        org.springframework.web.util.pattern.PathPatternParser parser = new org.springframework.web.util.pattern.PathPatternParser();
        PathPattern parse = parser.parse("/aa/{id}/{name}");
        boolean matches = parse.matches(PathContainer.parsePath("/aa/3/liyan"));
        PathPattern.PathRemainingMatchInfo pathRemainingMatchInfo = parse.matchStartOfPath(PathContainer.parsePath("/aa/3/liyan"));


        System.out.println(pathRemainingMatchInfo);

    }
}
