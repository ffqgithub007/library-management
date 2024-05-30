package com.net.library.service;

import com.net.library.pojo.BookShelf;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookShelfService
{
    /**
     * 分页 查询
     */
    PageInfo<BookShelf> listPage(Integer pageNum, Integer pageSize);
    /**
     * 查询所有
     * @param bookShelf
     * @return
     */
    List<BookShelf> selectAll (BookShelf bookShelf);
    /**
     * 通过id来进行查询
     */
    BookShelf findShelfById(Long id);
    /**
     * 插入
     */
    int insertAll(BookShelf bookShelf);
    /**
     * 修改
     */
    int updateShelf(BookShelf bookShelf);
    /**
     * 假删除
     */
    int deleteNoticeById(Long id);
}
