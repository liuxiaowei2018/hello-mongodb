package com.open.mongo.pojo;

import org.springframework.data.annotation.Id;

/**
 * @author liuxiaowei
 * @date 2022年07月28日 14:55
 * @Description 自增主键实体
 */
public abstract class IncIdEntity<T extends Number> {

    @Id
    private T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
