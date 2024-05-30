package com.net.library.service;

import com.net.library.pojo.BookNotice;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookNoticeService {
    /**
     * 分页查询
     */
    PageInfo<BookNotice> listPage(Integer pageNum,Integer pageSize);
    /**
     * 搜索查询
     * @param bookNotice
     * @return
     */
    List<BookNotice> selectAll (BookNotice bookNotice);
    /**
     * 通过id来进行查询
     */
    BookNotice findNoticeById(Long id);
    /**
     * 插入
     */
    Long insertAll(BookNotice bookNotice);
    /**
     * 修改
     */
    Long updateNotice(BookNotice bookNotice);
    /**
     * 假删除
     */
    Long deleteNoticeById(Long id);
}
