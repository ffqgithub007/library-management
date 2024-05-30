package com.net.library.mapper;

import com.net.library.pojo.BookNotice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookNoticeMapper {
    /**
     * 分页查询
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
