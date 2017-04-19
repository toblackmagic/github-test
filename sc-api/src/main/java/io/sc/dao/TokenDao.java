package io.sc.dao;

import io.sc.entity.TokenEntity;

/**
 * 用户Token
 * 
 * @author shanchong
 * @email shanchong@oo2oo.com.cn
 * @date 2017-03-23 15:22:07
 */
public interface TokenDao extends BaseDao<TokenEntity> {
    
    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);
	
}
