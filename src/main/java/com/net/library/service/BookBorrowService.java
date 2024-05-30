package com.net.library.service;

import com.net.library.pojo.BookBorrow;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookBorrowService {
    /**
     * 分页 查询
     */
    PageInfo<BookBorrow> listPage(Integer pageNum,Integer pageSize);
    /**
     * 查询所有的 借阅图书信息
     * @param
     */
    public List<BookBorrow> selectAllList(BookBorrow bookBorrow);
    /**
     * 根据id  查询图书
     */
    public BookBorrow selectId(Long id);
    /**
     * 删除
     */
    public int deleteById(Long id);
    /**
     * 修改
     */
    public int updateByID(BookBorrow bookBorrow);
    /**
     * 保存
     *
     */
    public int save(BookBorrow bookBorrow);
}
