package mybatis;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.test.lwk.dao.NewsDao;
import com.test.lwk.domain.News;

@RunWith(SpringJUnit4ClassRunner.class)

@Rollback(true)
@Transactional(transactionManager="transactionManager")
@ContextConfiguration(locations="classpath:applicationContent.xml")
public class NewDaoTest {
	
	@Autowired
	private NewsDao mapper;
	
	
	
	/*@Test
	public void addNews(){
		News news=new News();
		news.setId(UUID.randomUUID().toString());
		news.setAuthor("lwk");
		news.setContent("1111111111111111111111111111111111111111111111111111");
		news.setDescribe("22222222222222222222222222222222222");
		news.setTitle("mmmm");
		news.setImgUrl("sssssss");
		news.setPublishTime(new Date());
		mapper.addNews(news);
	}*/
	
	@Test
	public void getNews(){
		List<News> list = mapper.getAllNews();
		for (News news : list) {
			System.out.println(news.getAuthor()+news.getContent());
		}
	}
}
