package com.open.mongo.repository;

import com.open.mongo.HelloMongodbApplication;
import com.open.mongo.pojo.ProductDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuxiaowei
 * @date 2022年07月28日 15:00
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloMongodbApplication.class)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testInsert() {
        // 创建 ProductDO 对象
        ProductDO product = new ProductDO();
        product.setName("有名字");
        // 插入
        productRepository.insert(product);
        // 打印 ID
        System.out.println(product.getId());
    }
}