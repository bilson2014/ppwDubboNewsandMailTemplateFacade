package com.paipianwang.pat.facade.information.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.information.entity.PmsNews;

/**
 * 新闻服务接口
 * 
 * @version 1.0
 */
public interface PmsNewsFacade {

	public List<PmsNews> RecommendNews();
	
	/**
	 * 根据ID查找新闻实体
	 * @param newsId 新闻ID
	 * @return
	 */
	public PmsNews findNewsById(long newsId);
	
	/**
	 * 获取新闻列表
	 * @param pageMap
	 * @param pageParam
	 * @return
	 */
	public DataGrid<PmsNews> listWithPagination(PageParam pageParam, Map<String, Object> paramMap);
	
	/**
	 * 保存新闻实体
	 * @param pmsNews
	 * @return
	 */
	public long insert(PmsNews pmsNews);

	/**
	 * 更新新闻实体
	 * @param pmsNews
	 * @return
	 */
	public long update(PmsNews pmsNews);
	
	/**
	 * 根据新闻ID，批量删除新闻实体
	 * @param ids
	 * @return
	 */
	public long deleteByIds(long[] ids);
}
