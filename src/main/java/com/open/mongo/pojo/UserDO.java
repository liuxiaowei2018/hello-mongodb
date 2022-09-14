package com.open.mongo.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author liuxiaowei
 * @date 2022年07月28日 14:28
 * @Description
 */
@Data
@Document(collection = "User")
public class UserDO {

    /**
     * 用户信息
     */
    @Data
    public static class Profile {

        /**
         * 昵称
         */
        private String nickname;
        /**
         * 性别
         */
        private Integer gender;

    }

    @Id
    private Integer id;
    /**
     * 账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 用户信息
     */
    private Profile profile;
}
