package com.open.mongo.repository;

import com.open.mongo.pojo.UserDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author liuxiaowei
 * @date 2022年07月28日 14:41
 * @Description 基于方法名查询
 * 1.对于分页操作，需要使用到 Pageable 参数，需要作为方法的最后一个参数
 * 2.基于方法名查询，不支持内嵌对象的属性
 */
public interface UserRepository02 extends MongoRepository<UserDO, Integer> {

    UserDO findByUsername(String username);

    Page<UserDO> findByUsernameLike(String username, Pageable pageable);
}
