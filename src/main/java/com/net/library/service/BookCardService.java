package com.net.library.service;

import com.net.library.pojo.BookCard;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookCardService {
    /**
     * 分页 查询
     */
    PageInfo<BookCard> listPage(Integer pageNum, Integer pageSize);
    /**
     * 查询所有的 借阅图书信息
     * @param
     */
    public List<BookCard> selectAllList(BookCard bookCard);
    /**
     * 根据id  查询图书
     */
    public BookCard selectId(Long id);
    /**
     * 删除
     */
    public int deleteById(Long id);
    /**
     * 修改
     */
    public int updateByID(BookCard bookCard);
    /**
     * 保存
     *
     */
    public int save(BookCard bookCard);
}
