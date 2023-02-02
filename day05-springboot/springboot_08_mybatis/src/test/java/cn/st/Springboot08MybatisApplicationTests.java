package cn.st;

import cn.st.dao.BookDao;
import cn.st.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08MybatisApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private BookDao bookDao;

	@Test
	void testGetById() {
		Book book = bookDao.getById(2);
		System.out.println(book);
	}
}
