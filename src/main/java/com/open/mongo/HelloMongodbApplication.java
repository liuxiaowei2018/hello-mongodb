package com.open.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;

/**
 * @author liuxiaowei
 * @date 2022年03月17日 17:01
 * @Description
 */
@SpringBootApplication(exclude = {ElasticsearchAutoConfiguration.class, ElasticsearchDataAutoConfiguration.class})
public class HelloMongodbApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloMongodbApplication.class, args);
    }
}
