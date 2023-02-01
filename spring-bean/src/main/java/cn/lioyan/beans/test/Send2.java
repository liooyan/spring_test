package cn.lioyan.beans.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * {@link Send2}
 *
 * @author com.lioyan
 * @date 2023/2/1  11:11
 */
@Service
public class Send2
{

    private final Send send;

    @Autowired
    private Send send23;

    public Send2(Send send)
    {
        this.send = send;
    }

    public void send()
    {
        System.out.println(1111);
    }
}
