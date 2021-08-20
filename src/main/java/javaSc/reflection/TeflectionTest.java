package javaSc.reflection;

import javaSc.reflection.bean.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 关于java 反射的所有整理
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/18 10:55 上午
 */
public class TeflectionTest {
    /**
     * 关于获取 class 对象 3种方式
     */
    public static class ClassTest {
        /**
         * 1、通过 Class.forName 获取
         * 2、通过xxx.class 获取
         * 3、通过对象的 getClass方法获取
         *
         * @throws ClassNotFoundException
         */
        @Test
        public void forClass() throws ClassNotFoundException {
            Class classTest = Class.forName("javaSc.reflection.TeflectionTest");
            System.out.println(classTest);

            classTest = TeflectionTest.class;
            System.out.println(classTest);

            classTest = new TeflectionTest().getClass();
            System.out.println(classTest);
        }

    }

    /**
     * 通过class获取构造函数
     * 并且通过构造函数创建对象
     */
    public static class ConstructorTest {
        public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            Class studentClass = Student.class;
            //获取所以public的构造函数
            final Constructor[] constructors = studentClass.getConstructors();
            System.out.println("获取所以public的构造函数");
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }
            //根据参数获取指定的构造函数
            final Constructor constructor1 = studentClass.getConstructor(char.class);
            System.out.println("根据参数获取指定的构造函数");
            System.out.println(constructor1);

            //获取全部的构造函数
            final Constructor[] declaredConstructors = studentClass.getDeclaredConstructors();
            System.out.println("获取全部的构造函数");
            for (Constructor constructor : declaredConstructors) {
                System.out.println(constructor);
            }
            //根据构造函数创建实例
            System.out.println("根据构造函数创建实例");
            final Object c = constructor1.newInstance('c');
            System.out.println(c);
        }
    }

    /**
     * 关于成员变量的反射
     */
    public static class FieldTest {

        public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            Class studentClass = Student.class;
            //获取所有公开的字段
             Field[] fields = studentClass.getFields();
            System.out.println("获取所有公开的字段");
            for (Field field : fields) {
                System.out.println(field);
            }
            //获取指定的字段
            final Field name = studentClass.getField("name");
            System.out.println("获取指定的字段");
            System.out.println(name);

            //获取全部的字段
            fields = studentClass.getDeclaredFields();
            System.out.println("获取全部的字段");
            for (Field field : fields) {
                System.out.println(field);
            }
            //通过field 修改成员变量
            Student student = (Student) studentClass.getConstructor().newInstance();
            name.set(student,"liyan");
            System.out.println("修改字段");
            System.out.println(student.name);

            //暴力修改私有变量
            final Field sex = studentClass.getDeclaredField("sex");
            sex.setAccessible(true);
            sex.set(student,'x');
            System.out.println("修改私有字段");
            System.out.println(student);

        }

    }

    /**
     * 反射对于方法的调用
     *
     *
     */
    public static class MethodTest{

        public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            Class studentClass = Student.class;
            Student student = (Student) studentClass.getConstructor().newInstance();
            //获取所有公开方法
            final Method[] methods = studentClass.getMethods();
            System.out.println("获取所有公开方法");
            for (Method method : methods) {
                System.out.println(method);
            }

            //获取所有方法
            final Method[] declaredMethods = studentClass.getDeclaredMethods();
            System.out.println("获取所有方法");
            for (Method method : declaredMethods) {
                System.out.println(method);
            }

            //获取指定方法
            final Method show4 = studentClass.getMethod("show1", String.class);
            System.out.println("获取指定方法");
            System.out.println(show4);

            System.out.println("方法调用");
            Method m = studentClass.getDeclaredMethod("show4", int.class);
            System.out.println(m);
            m.setAccessible(true);//解除私有限定
            Object result = m.invoke(student, 20);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
            System.out.println("返回值：" + result);
        }


    }

}
