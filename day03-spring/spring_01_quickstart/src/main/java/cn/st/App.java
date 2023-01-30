package cn.st;

import cn.st.dao.BookDao;
import cn.st.dao.impl.BookDaoImpl;
import cn.st.service.BookService;
import cn.st.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
//        BookDao bookDao = new BookDaoImpl();
//        bookDao.save();
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
