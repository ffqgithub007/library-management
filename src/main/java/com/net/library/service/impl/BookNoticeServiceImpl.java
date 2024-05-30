package com.net.library.service.impl;

import com.net.library.mapper.BookNoticeMapper;
import com.net.library.pojo.BookNotice;
import com.net.library.service.BookNoticeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookNoticeServiceImpl implements BookNoticeService {

    @Autowired
    BookNoticeMapper bookNoticeMapper;

    @Override
    public PageInfo<BookNotice> listPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<BookNotice> bookNotices = bookNoticeMapper.selectAll(new BookNotice());
        PageInfo<BookNotice> pageInfo=new PageInfo<>(bookNotices);
        return pageInfo;
    }

    @Override
    public List<BookNotice> selectAll(BookNotice bookNotice) { //查询所有，这个查询所有是传入了一个对象过去，你直接赋值一个空对象就可以将所有数据查询出来
        return bookNoticeMapper.selectAll(bookNotice);
    }

    @Override
    public BookNotice findNoticeById(Long id) { //通过id 来进行查询
        return bookNoticeMapper.findNoticeById(id);
    }

    @Override
    public Long insertAll(BookNotice bookNotice) { //插入数据
        return bookNoticeMapper.insertAll(bookNotice);
    }

    @Override
    public Long updateNotice(BookNotice bookNotice) {  //修改数据
        return bookNoticeMapper.updateNotice(bookNotice);
    }

    @Override
    public Long deleteNoticeById(Long id) {   //通过id 来删除
        return bookNoticeMapper.deleteNoticeById(id);
    }
}
