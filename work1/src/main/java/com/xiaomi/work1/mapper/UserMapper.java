package com.xiaomi.work1.mapper;

import com.xiaomi.work1.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: UserMapper
 * Package: com.xiaomi.work1.mapper
 * Description:
 *
 * @Author WangYang
 * @Create 2024/5/22 15:25
 * @Version 1.0
 */
public interface UserMapper {
    public User getUserById(@Param("id") int id);
}
