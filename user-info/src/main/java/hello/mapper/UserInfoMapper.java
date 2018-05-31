package hello.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserInfoMapper {
    /**
     * 获取用户总数
     * @return count num of all users
     */
    int getUserInfoCount();
}
