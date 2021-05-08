package javaSc.reflection;

import javaSc.reflection.bean.Student;
import javaSc.reflection.bean.TestA;

/**
 * 注解解析
 * https://www.jianshu.com/p/9471d6bcf4cf
 *
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/18 11:34 上午
 */
public class AnnotationTest {

    public static void main(String[] args) {


        final Class<Student> studentClass = Student.class;
        final TestA annotation = studentClass.getAnnotation(TestA.class);

        System.out.println(annotation);
        final boolean annotationPresent = studentClass.isAnnotationPresent(TestA.class);
        System.out.println(annotationPresent);


    }
}
