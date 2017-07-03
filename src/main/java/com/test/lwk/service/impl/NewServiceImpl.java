package com.test.lwk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.lwk.dao.NewsDao;
import com.test.lwk.domain.News;
import com.test.lwk.service.INewService;

@Service
public class NewServiceImpl implements INewService {
	
	@Autowired
	private NewsDao newDao;
	
	public News getNewById(String id) {
		
		return newDao.getNewById(id);
	}

	public List<News> getAllNews() {
		
		return newDao.getAllNews();
	}

	public void addNews(News news) {
		newDao.addNews(news);
		
	}
	
	
}
