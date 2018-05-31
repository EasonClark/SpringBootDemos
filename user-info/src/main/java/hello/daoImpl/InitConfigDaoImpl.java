package hello.daoImpl;

import hello.dao.InitConfigDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hasee
 * 2018-05-31
 */

@Component("initConfigDao")
public class InitConfigDaoImpl implements InitConfigDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 获取用户总数
     * @return count num of all users
     */
    @Override
    public int getUserInfoCount() {
        return sqlSessionTemplate.selectOne("getUserInfoCount");
    }
}
