package javaSc.reflection;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * 3种代理模式
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/19 10:59 下午
 */
public class ProxyTest {
    /**
     * 静态代理
     *
     */
    public static class  StaticProxy{
        public static void main(String[] args) {
            AdminService adminService = new AdminServiceImpl();
            AdminService adminServiceProxy = new AdminServiceProxy(adminService);

            adminServiceProxy.find();
            adminServiceProxy.update();
        }

        public  interface AdminService{
            void  update();
            Object find();
        }

        public static class AdminServiceImpl implements AdminService{
            public void update() {
                System.out.println("修改管理系统数据");
            }

            public Object find() {
                System.out.println("查看管理系统数据");
                return new Object();
            }
        }
        public static class AdminServiceProxy implements AdminService {

            private AdminService adminService;

            public AdminServiceProxy(AdminService adminService) {
                this.adminService = adminService;
            }

            public void update() {
                System.out.println("判断用户是否有权限进行update操作");
                adminService.update();
                System.out.println("记录用户执行update操作的用户信息、更改内容和时间等");
            }

            public Object find() {
                System.out.println("判断用户是否有权限进行find操作");
                System.out.println("记录用户执行find操作的用户信息、查看内容和时间等");
                return adminService.find();
            }
        }


    }


    public static class  DynamicProxy{
        public static class AdminServiceInvocation  implements InvocationHandler {

            private Object target;

            public AdminServiceInvocation(Object target) {
                this.target = target;
            }

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("判断用户是否有权限进行操作");
                Object obj = method.invoke(target);
                System.out.println("记录用户执行操作的用户信息、更改内容和时间等");
                return obj;
            }
        }

        public static void main(String[] args) {
            StaticProxy.AdminService adminService = new StaticProxy.AdminServiceImpl();
            StaticProxy.AdminService target = new StaticProxy.AdminServiceImpl();
            AdminServiceInvocation invocation = new AdminServiceInvocation(adminService);
            StaticProxy.AdminService proxy2 = (StaticProxy.AdminService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocation);

            Object obj2 = proxy2.find();
            System.out.println("find 返回对象：" + obj2.getClass());
            System.out.println("----------------------------------");
            proxy2.update();
        }

    }

    public static class  CglibProxy{
        public static class CglibProxyTest {
            public static void main(String[] args) {

                AdminCglibService target = new AdminCglibService();
                AdminServiceCglibProxy proxyFactory = new AdminServiceCglibProxy(target);
                AdminCglibService proxy = (AdminCglibService)proxyFactory.getProxyInstance();

                System.out.println("代理对象：" + proxy.getClass());

                Object obj = proxy.find();
                System.out.println("find 返回对象：" + obj.getClass());
                System.out.println("----------------------------------");
                proxy.update();
            }
        }
        public static  class AdminCglibService {
            public void update() {
                System.out.println("修改管理系统数据");
            }

            public Object find() {
                System.out.println("查看管理系统数据");
                return new Object();
            }
        }
        public static class AdminServiceCglibProxy implements MethodInterceptor {

            private Object target;

            public AdminServiceCglibProxy(Object target) {
                this.target = target;
            }

            //给目标对象创建一个代理对象
            public Object getProxyInstance() {
                //工具类
                Enhancer en = new Enhancer();
                //设置父类
                en.setSuperclass(target.getClass());
                //设置回调函数
                en.setCallback(this);
                //创建子类代理对象
                return en.create();
            }

            public Object intercept(Object object, Method method, Object[] arg2, MethodProxy proxy) throws Throwable {

                System.out.println("判断用户是否有权限进行操作");
                Object obj = method.invoke(target);
                System.out.println("记录用户执行操作的用户信息、更改内容和时间等");
                return obj;
            }


        }

    }


}
