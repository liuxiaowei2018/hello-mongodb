package com.open.mongo.pojo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author liuxiaowei
 * @date 2022年07月28日 14:56
 * @Description
 */
@Data
@Document(collection = "Product")
public class ProductDO extends IncIdEntity<Integer> {

    /**
     * 商品名
     */
    private String name;

    public String getName() {
        return name;
    }

    public ProductDO setName(String name) {
        this.name = name;
        return this;
    }
}
