package com.net.library.service.impl;

import com.net.library.mapper.BookWarehouseMapper;
import com.net.library.pojo.BookWarehouse;
import com.net.library.service.BookWarehouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookWarehouseServiceImpl implements BookWarehouseService {

    @Autowired
    BookWarehouseMapper bookWarehouseMapper;

    @Override
    public PageInfo<BookWarehouse> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<BookWarehouse> bookWarehouses = bookWarehouseMapper.selectBooksList(new BookWarehouse());
        PageInfo<BookWarehouse> pageInfo = new PageInfo<BookWarehouse>(bookWarehouses);
        return pageInfo;
    }

    @Override
    public BookWarehouse selectBookById(String ISBN) {
        return bookWarehouseMapper.selectBookById(ISBN);
    }


    @Override
    public List<BookWarehouse> selectBooksList(BookWarehouse bookWarehouse) {
        return bookWarehouseMapper.selectBooksList(bookWarehouse);
    }

    @Override
    public int insertBook(BookWarehouse bookWarehouse) {
        return bookWarehouseMapper.insertBook(bookWarehouse);
    }

    @Override
    public int updateBook(BookWarehouse bookWarehouse) {
        return bookWarehouseMapper.updateBook(bookWarehouse);
    }

    @Override
    public int deleteBookById(String id) {
        return bookWarehouseMapper.deleteBookById(id);
    }

    @Override
    public int deleteBookByIds(String[] ids) {
        return bookWarehouseMapper.deleteBookByIds(ids);
    }

    @Override
    public int deleteDelBookByIds(String[] ids) {
        return bookWarehouseMapper.deleteDelBookByIds(ids);
    }

}
