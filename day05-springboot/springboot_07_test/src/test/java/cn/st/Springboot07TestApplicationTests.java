package cn.st;

import cn.st.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot07TestApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private BookService bookService;

    @Test
    public void save() {
        bookService.save();
    }
}
