package cn.lioyan.test;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * {@link ControllerAdviceTest}
 *
 * @author com.lioyan
 * @date 2023/2/15  11:37
 */
@ControllerAdvice
public class ControllerAdviceTest
{
    @InitBinder
    public void initBinderXXX(WebDataBinder binder) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor dateEditor = new CustomDateEditor(df, true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }
}
