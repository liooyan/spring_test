package data.jdbc.test.dao;

import data.jdbc.test.bean.KgHotSearchDo;
import org.springframework.data.repository.CrudRepository;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/1 11:27 上午
 */
public interface KgHotDao extends CrudRepository<KgHotSearchDo, Integer> {
}
