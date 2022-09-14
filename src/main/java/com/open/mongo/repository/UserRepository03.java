package com.open.mongo.repository;

import com.open.mongo.pojo.UserDO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author liuxiaowei
 * @date 2022年07月28日 14:41
 * @Description 自定义查询
 */
public interface UserRepository03 extends MongoRepository<UserDO, Integer> {

    /**
     *  使用 username 精准匹配
     * @date 2022/9/14 15:08
     * @param username
     * @return com.open.mongo.pojo.UserDO
     */
    default UserDO findByUsername01(String username) {
        // 创建 Example 对象，使用 username 查询
        UserDO probe = new UserDO();
        // 精准匹配 username 查询
        probe.setUsername(username);
        Example<UserDO> example = Example.of(probe);
        // 执行查询
        return findOne(example)
                // 如果为空，则返回 null
                .orElse(null);
    }

    /**
     * 使用 username 模糊匹配
     * @date 2022/9/14 15:08
     * @param username
     * @return com.open.mongo.pojo.UserDO
     */
    default UserDO findByUsernameLike01(String username) {
        // 创建 Example 对象，使用 username 查询
        UserDO probe = new UserDO();
        // 这里还需要设置
        probe.setUsername(username);
        ExampleMatcher matcher = ExampleMatcher.matching()
                // 模糊匹配 username 查询
                .withMatcher("username", ExampleMatcher.GenericPropertyMatchers.contains());
        Example<UserDO> example = Example.of(probe, matcher);
        // 执行查询
        return findOne(example)
                // 如果为空，则返回 null
                .orElse(null);
    }
}
