package cn.lioyan.validation;

import org.springframework.beans.AbstractNestablePropertyAccessor;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;


/**
 * {@link org.springframework.validation.DataBinder}
 * <pre>
 *  功能1： 参数绑定 ，使用的是 {@link AbstractNestablePropertyAccessor} 功能，可以在core中找到解析
 *          其中可以自定义为它注册不同的属性转换器
 *  功能2： 校验 https://beanvalidation.org/2.0/
 *          需要使用 {@link Validator}进行校验
 *
 * </pre>
 *
 * @author com.lioyan
 * @date 2023/2/15  11:50
 */
public class DataBinder
{
    public static void main(String[] args)
        throws BindException
    {
        Person person = new Person();
        org.springframework.validation.DataBinder binder = new org.springframework.validation.DataBinder(person, "person");
        MutablePropertyValues pvs = new MutablePropertyValues();
        //        pvs.add("name", "fsx");
        pvs.add("age", "18");
        pvs.add("test.name", "testRun");

        binder.bind(pvs);
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        binder.setValidator(new SpringValidatorAdapter(validator));
        binder.validate();
        BindingResult bindingResult = binder.getBindingResult();
        System.out.println(bindingResult);
        System.out.println(person);

    }

    static class Person
    {

        @NotNull
        private String name;

        private Integer age;

        private Test test = new Test();

        public Test getTest()
        {
            return test;
        }

        public void setTest(Test test)
        {
            this.test = test;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public Integer getAge()
        {
            return age;
        }

        public void setAge(Integer age)
        {
            this.age = age;
        }
    }


    static class Test
    {

        private String name;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }
}
