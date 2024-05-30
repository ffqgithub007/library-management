package com.net.library.service.impl;

import com.net.library.mapper.BookCardMapper;
import com.net.library.pojo.BookCard;
import com.net.library.service.BookCardService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCardServiceImpl implements BookCardService {

    @Autowired
    BookCardMapper bookCardMapper;

    @Override
    public PageInfo<BookCard> listPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<BookCard> bookCards = bookCardMapper.selectAllList(new BookCard());
        PageInfo<BookCard> pageInfo=new PageInfo<BookCard>(bookCards);
        return pageInfo;
    }

    @Override
    public List<BookCard> selectAllList(BookCard bookCard) {
        return bookCardMapper.selectAllList(bookCard);
    }

    @Override
    public BookCard selectId(Long id) {
        return bookCardMapper.selectId(id);
    }

    @Override
    public int deleteById(Long id) {
        return bookCardMapper.deleteById(id);
    }

    @Override
    public int updateByID(BookCard bookCard) {
        return bookCardMapper.updateByID(bookCard);
    }

    @Override
    public int save(BookCard bookCard) {
        return bookCardMapper.save(bookCard);
    }
}
