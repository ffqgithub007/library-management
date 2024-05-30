package com.net.library.service.impl;

import com.net.library.mapper.BookBorrowMapper;
import com.net.library.pojo.BookBorrow;
import com.net.library.service.BookBorrowService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookBorrowServiceImpl implements BookBorrowService {

    @Autowired
    BookBorrowMapper bookBorrowMapper;

    public List<BookBorrow> selectAllList(BookBorrow bookBorrow) {
        return bookBorrowMapper.selectAllList(bookBorrow);
    }

    @Override
    public BookBorrow selectId(Long id){
        return bookBorrowMapper.selectId(id);
    }


    @Override
    public PageInfo<BookBorrow> listPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<BookBorrow> bookBorrows = bookBorrowMapper.selectAllList(new BookBorrow());
        PageInfo<BookBorrow> pageInfo=new PageInfo<BookBorrow>(bookBorrows);
          return pageInfo;
    }

    @Override
    public int deleteById(Long id) {
        return bookBorrowMapper.deleteById(id);
    }

    @Override
    public int updateByID(BookBorrow bookBorrow){
        return bookBorrowMapper.updateByID(bookBorrow);
    }

    @Override
    public int save(BookBorrow bookBorrow) {
        return bookBorrowMapper.save(bookBorrow);
    }
}
