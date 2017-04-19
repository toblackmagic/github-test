package io.sc.dao;

import io.sc.entity.SysRoleEntity;

import java.util.List;

/**
 * 角色管理
 * 
 * @author shanchong
 * @email shanchong@oo2oo.com.cn
 * @date 2016年9月18日 上午9:33:33
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
