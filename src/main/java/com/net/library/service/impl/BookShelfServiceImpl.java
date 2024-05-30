package com.net.library.service.impl;

import com.net.library.mapper.BookShelfMapper;
import com.net.library.pojo.BookShelf;
import com.net.library.service.BookShelfService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookShelfServiceImpl implements BookShelfService {
    @Autowired
    BookShelfMapper bookShelfMapper;

    @Override
    public PageInfo<BookShelf> listPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<BookShelf> bookShelves = bookShelfMapper.selectAll(new BookShelf());
        PageInfo<BookShelf> pageInfo=new PageInfo<>(bookShelves);
        return pageInfo;
    }

    @Override
    public List<BookShelf> selectAll(BookShelf bookShelf) {
        return bookShelfMapper.selectAll(bookShelf);
    }

    @Override
    public BookShelf findShelfById(Long id) {
        return bookShelfMapper.findShelfById(id);
    }

    @Override
    public int insertAll(BookShelf bookShelf) {
        return bookShelfMapper.insertAll(bookShelf);
    }

    @Override
    public int updateShelf(BookShelf bookShelf) {
        return bookShelfMapper.updateShelf(bookShelf);
    }

    @Override
    public int deleteNoticeById(Long id) {
        return bookShelfMapper.deleteNoticeById(id);
    }
}
