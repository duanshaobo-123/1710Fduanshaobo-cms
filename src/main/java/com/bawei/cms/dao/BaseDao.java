package com.bawei.cms.dao;

import java.util.List;



public interface BaseDao<T> {
	/**
	 * 按条件查询
	 * @param user
	 * @return
	 */
	List<T> select(T t);
	/**
	 * 根据Id查询
	 * @param id
	 * @return
	 */
	T selectById(Integer id);
	/**
	 * 新增
	 * @param user
	 * @return
	 */
	int insert(T t);
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	int update(T t);
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	int delete(String ids);
}
