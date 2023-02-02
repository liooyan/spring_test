package cn.lioyan.beans.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
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

    private  AbSend send;

    @Autowired
    private Send send23;

    @Value("${aa:13}")
    private String aq;

    @Autowired
    public Send2(AbSend send, Send send23)
    {
        this.send = send;
        this.send23 = send23;
    }

    public Send2()
    {

    }

    @Lookup
    public AbSend getSend()
    {
        return null;
    }

    public void send()
    {
        System.out.println(1111);
    }
}
