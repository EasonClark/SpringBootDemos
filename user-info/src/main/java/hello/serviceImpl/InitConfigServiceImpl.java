package hello.serviceImpl;

import hello.mapper.UserInfoMapper;
import hello.service.InitConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hasee
 * 2018-05-31
 */

@Service("initConfigService")
public class InitConfigServiceImpl implements InitConfigService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 获取用户总数
     * @return count num of all users
     */
    @Override
    public int getUserInfoCount() {
        return userInfoMapper.getUserInfoCount();
    }
}
