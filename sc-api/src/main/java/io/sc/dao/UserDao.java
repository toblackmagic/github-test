package io.sc.dao;

import io.sc.entity.UserEntity;

/**
 * 用户
 * 
 * @author shanchong
 * @email shanchong@oo2oo.com.cn
 * @date 2017-03-23 15:22:06
 */
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
