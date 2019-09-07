package com.bookstore.service;

import com.bookstore.dao.JdbcTemplateDao;
import com.bookstore.dao.SimpleJdbcInsertDao;
import org.springframework.stereotype.Service;

@Service
public class BookstoreService {

    private final JdbcTemplateDao jdbcTemplateDao;
    private final SimpleJdbcInsertDao simpleJdbcInsertDao;

    public BookstoreService(JdbcTemplateDao jdbcTemplateDao, SimpleJdbcInsertDao simpleJdbcInsertDao) {
        this.jdbcTemplateDao = jdbcTemplateDao;
        this.simpleJdbcInsertDao = simpleJdbcInsertDao;
    }

    public void insertAuthorGetAutoGeneratedKeyViaJdbcTemplate() {
        long pk = jdbcTemplateDao.insertAuthor(23, "Mark Janel", "Anthology");
        System.out.println("Auto generated key: " + pk);
    }
    
     public void insertAuthorGetAutoGeneratedKeyViaSimpleJdbcInsert() {
        long pk = simpleJdbcInsertDao.insertAuthor(42, "Olivia Goy", "Horror");
        System.out.println("Auto generated key: " + pk);
    }
}
