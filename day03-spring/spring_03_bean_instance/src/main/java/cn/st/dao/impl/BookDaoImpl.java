package cn.st.dao.impl;

import cn.st.dao.BookDao;

public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("book dao constructor is running ....");
    }

    public void save() {
        System.out.println("book dao save ...");
    }

}
