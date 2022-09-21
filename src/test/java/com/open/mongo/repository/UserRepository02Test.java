package com.open.mongo.repository;

import com.open.mongo.HelloMongodbApplication;
import com.open.mongo.pojo.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuxiaowei
 * @date 2022年07月28日 14:43
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloMongodbApplication.class)
public class UserRepository02Test {

    @Autowired
    private UserRepository02 userRepository;

    @Test
    public void findByUsername() {
        UserDO user = userRepository.findByUsername("dehua");
        System.out.println(user);
    }

    @Test
    public void findByUsernameLike() {
        // 创建排序条件 ID 倒序
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        // 创建分页条件
        Pageable pageable = PageRequest.of(0, 10, sort);
        // 执行分页操作
        Page<UserDO> page = userRepository.findByUsernameLike("de", pageable);
        // 打印
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }
}