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
public class UserRepository03Test {

    @Autowired
    private UserRepository03 userRepository;

    @Test
    public void testFindByUsername01() {
        UserDO user = userRepository.findByUsername01("xiaowei");
        System.out.println(user);
    }

    @Test
    public void testFindByUsernameLike01() {
        UserDO user = userRepository.findByUsernameLike01("xiao");
        System.out.println(user);
    }
}