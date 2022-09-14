package com.open.mongo.repository;

import com.open.mongo.pojo.ProductDO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author liuxiaowei
 * @date 2022年07月28日 14:29
 * @Description MongoRepository<UserDO, Integer> <实体,主键>
 */
public interface ProductRepository extends MongoRepository<ProductDO, Integer> {

}
