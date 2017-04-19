package io.sc.dao;

import io.sc.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定时任务
 * 
 * @author shanchong
 * @email shanchong@oo2oo.com.cn
 * @date 2016年12月1日 下午10:29:57
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
