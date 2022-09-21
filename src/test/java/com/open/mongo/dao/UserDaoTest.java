package com.open.mongo.dao;

import com.open.mongo.HelloMongodbApplication;
import com.open.mongo.pojo.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author liuxiaowei
 * @date 2022年07月28日 14:51
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloMongodbApplication.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void insert() {
        // 创建 UserDO 对象
        UserDO user = new UserDO();
        user.setId(2); // 这里先临时写死一个 ID 编号，后面演示自增 ID 的时候，在修改这块
        user.setUsername("xiaowei");
        user.setPassword("buzhidao");
        user.setCreateTime(new Date());
        // 创建 Profile 对象
        UserDO.Profile profile = new UserDO.Profile();
        profile.setNickname("xiaoweididi");
        profile.setGender(1);
        user.setProfile(profile);
        // 存储到 DB
        userDao.insert(user);
    }

    @Test
    public void updateById() {
        // 创建 UserDO 对象
        UserDO updateUser = new UserDO();
        updateUser.setId(2);
        updateUser.setUsername("xxx");

        // 执行更新
        userDao.updateById(updateUser);
    }

    @Test
    public void deleteById() {
        userDao.deleteById(1);
    }

    @Test
    public void findById() {
        UserDO userDO = userDao.findById(1);
        System.out.println(userDO);
    }

    @Test
    public void findByUsername() {
        userDao.findByUsername("xxx");
    }

    @Test
    public void findAllById() {
        List<UserDO> users = userDao.findAllById(Arrays.asList(1, 4));
        users.forEach(System.out::println);
    }
}