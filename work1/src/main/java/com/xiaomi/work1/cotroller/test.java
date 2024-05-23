package com.xiaomi.work1.cotroller;

import com.xiaomi.work1.bean.User;
import com.xiaomi.work1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: test
 * Package: com.xiaomi.work1.cotroller
 * Description:
 *
 * @Author WangYang
 * @Create 2024/5/21 22:36
 * @Version 1.0
 */

@RestController
public class test {
    @Autowired
    UserMapper userMapper;

    /**
     *
     * @param id
     * @return
     */
    @GetMapping ("/user/{id}")
    public User index(@PathVariable("id") int id){
        User user = userMapper.getUserById(id);
        return user;
    }
}

