package boot.start.test.populate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * 有 bean的填充
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/4 7:04 下午
 */
@Component

public class HaveBeanPaulateBean {

    @Autowired
    @Qualifier("notPapulateBean")
    private NotPapulateBean notPapulateBean;


    public NotPapulateBean getNotPapulateBean() {
        return notPapulateBean;
    }

    public void setNotPapulateBean(NotPapulateBean notPapulateBean) {
        this.notPapulateBean = notPapulateBean;
    }
}
