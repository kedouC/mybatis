package com.test.lwk.dao;

import java.util.List;

import com.test.lwk.domain.News;

public interface NewsDao {
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	News getNewById(String id);
	
	/**
	 * 查询所有新闻
	 * @return
	 */
	List<News> getAllNews();
	
	/**
	 * 添加新闻
	 * @param news
	 */
	void addNews(News news);
}